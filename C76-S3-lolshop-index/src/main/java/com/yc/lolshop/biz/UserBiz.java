package com.yc.lolshop.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.lolshop.bean.User;
import com.yc.lolshop.bean.UserExample;
import com.yc.lolshop.dao.CartitemMapper;
import com.yc.lolshop.dao.UserMapper;


@Service
public class UserBiz {

	@Resource
	UserMapper um;
	@Resource
	CartitemMapper cim;
	
	public User login(User user) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername())
			.andPasswordEqualTo(user.getPassword());
		List<User> list = um.selectByExample(ue);
		if(list.size()!=1) {
			throw new BizException("用户名或密码错误!");
		}
		return list.get(0);
	}
	
	/*
	 * public void addCartitem(User user, Cartitem cartitem) { // 更新数据库里面对象的购物数量
	 * cartitem.setId(user.getId()); if(cim.addCount(cartitem)==0) { // 未更新到指定记录,
	 * 就新增一条 cartitem.setCount(1); cim.insert(cartitem); } }
	 */

}