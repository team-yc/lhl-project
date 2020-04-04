package com.yc.lolshop.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.lolshop.bean.User;
import com.yc.lolshop.bean.UserExample;
import com.yc.lolshop.dao.CartMapper;
import com.yc.lolshop.dao.UserMapper;

@Service
public class UserBiz {

	@Resource
	UserMapper um;
	@Resource
	CartMapper cm;
<<<<<<< HEAD

	public User login(User user) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> list = um.selectByExample(ue);
		if (list.size() != 1) {
			throw new BizException("用户名或密码错误!");
		}
		return list.get(0);
	}

	@Resource
	private MailService ms;

	public String forget(String username) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(username);
		List<User> list = um.selectByExample(ue);
		if (list.size() == 1) {
			User user = list.get(0);
			String vcode = System.currentTimeMillis() + "";
			vcode = vcode.substring(vcode.length() - 4, vcode.length());
			System.out.println("======vcode" + vcode);
			String content = "您重置密码所需的验证码是：" + vcode;
			ms.sendSimpleMail(user.getEmail(), "重置密码", content);
			return vcode;
		} else {
			throw new BizException(1007, "name", "用户名错误");
		}
	}

	public void savePwd(User user, String repwd) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername());
		List<User> list = um.selectByExample(ue);
		if (list.size() == 0) {
			throw new BizException(1008, "username", "用户名错误");
		}
		if (!user.getPassword().equals(repwd)) {
			throw new BizException(1009, "pwd", "密码不一致");
		}
		// 修改
		um.updateByExampleSelective(user, ue);
		System.out.println("修改成功！");
	}

}
=======
	
	public User login(User user) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> list = um.selectByExample(ue);
		if(list.size()!=1) {
			throw new BizException("用户名或密码错误!");
		}
		return list.get(0);
	}
	
	@Resource
	private MailService ms;
	
	public String forget(String username) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(username);
		List<User> list = um.selectByExample(ue);
		if(list.size() == 1) {
			User user = list.get(0);
			String vcode = System.currentTimeMillis()+"";
			vcode = vcode.substring(vcode.length()-4,vcode.length());
			System.out.println("======vcode"+vcode);
			String content = "您重置密码所需的验证码是：" + vcode;
			ms.sendSimpleMail(user.getEmail(), "重置密码", content);
			return vcode;
		}else {
			throw new BizException(1007,"name","用户名错误");
		}
	}

	public void savePwd(User user, String repwd) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername());
		List<User> list = um.selectByExample(ue);
		if(list.size() == 0) {
			throw new BizException(1008,"username","用户名错误");
		}
		if(!user.getPassword().equals( repwd )) {
			throw new BizException(1009,"pwd","密码不一致");
		}
		//修改
		um.updateByExampleSelective(user,ue);
		System.out.println("修改成功！");
	}

}
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git
