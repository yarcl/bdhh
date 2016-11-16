package com.zrgk.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.zrgk.dao.UserBeanDao;
import com.zrgk.entity.UserBean;
import com.zrgk.service.UserBeanService;

@Service
public class UserBeanServiceImpl implements UserBeanService{

	private UserBeanDao ubd;
	
	public UserBeanDao getUbd() {
		return ubd;
	}

	public void setUbd(UserBeanDao ubd) {
		this.ubd = ubd;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public UserBean loginIn(String username, String userps) {
		Map map = new HashMap();
		map.put("username", username);
		map.put("pwd", userps);
		UserBean ub  = ubd.loginIn(map);
		return ub;
	}
	
}
