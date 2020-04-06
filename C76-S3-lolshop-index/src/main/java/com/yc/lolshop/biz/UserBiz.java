package com.yc.lolshop.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.yc.lolshop.bean.User;
import com.yc.lolshop.bean.UserExample;
import com.yc.lolshop.dao.CartMapper;
import com.yc.lolshop.dao.UserMapper;
import com.yc.lolshop.vo.Result;

@Service
public class UserBiz {

	@Resource
	UserMapper um;
	@Resource
	CartMapper cm;

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

	public void reg(User user,String repassword, Errors errors) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername());
		if(um.countByExample(ue) > 0) {
			throw new BizException(101, "username", "用户名已存在！");
		}
		if(repassword.equals(user.getPassword()) == false) {
			throw new BizException(102, "password", "密码不一致！");
		}
		um.insert(user);
	}

}
