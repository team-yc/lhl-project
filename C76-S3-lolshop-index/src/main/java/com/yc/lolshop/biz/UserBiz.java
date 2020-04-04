package com.yc.lolshop.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.lolshop.bean.Cart;
import com.yc.lolshop.bean.CartExample;
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
	
	public User login(User user) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> list = um.selectByExample(ue);
		if(list.size()!=1) {
			throw new BizException("用户名或密码错误!");
		}
		return list.get(0);
	}
	
//	public void addCart(User user, Cart cart) {
//		// 更新数据库里面对象的购物数量
//		cart.setUid(user.getId());
//		if(ecm.addCount(cart)==0) {
//			// 未更新到指定记录, 就新增一条
//			cart.setCount(1);
//			ecm.insert(cart);
//		}
//	}

}
