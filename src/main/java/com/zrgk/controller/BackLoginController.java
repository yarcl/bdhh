package com.zrgk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zrgk.entity.UserBean;
import com.zrgk.service.UserBeanService;

@Controller
@RequestMapping(value="/")
public class BackLoginController {
	
	@Autowired
	private UserBeanService ubs;
	
	public UserBeanService getUbs() {
		return ubs;
	}

	public void setUbs(UserBeanService ubs) {
		this.ubs = ubs;
	}

	@RequestMapping(value="LoginController.do")
	public String loginIn(String username, String pwd){
		UserBean ub = ubs.loginIn(username, pwd);
		if(ub!=null){
			return "redirect:houtai/index.jsp";
		}else {
			return "redirect:houtai/login.jsp";
		}
	}
	
}
