package com.zrgk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public String loginIn(String username, String pwd, String imgCode, HttpServletRequest request, HttpServletResponse response){
		String code = (String)request.getSession().getAttribute("sysCode");
		if(code.toUpperCase().equals(imgCode.toUpperCase())){
			UserBean ub =ubs.loginIn(username, pwd);
			if(ub!=null){
				return "redirect:houtai/index.jsp";
			}else {
				return "redirect:houtai/login.jsp";
			}
		} else {
			try {
				response.setContentType("text/html; charset=utf-8"); 
				PrintWriter out = response.getWriter();
				
				out.print("<script>alert('请输入正确的验证码！！！');location.href='houtai/login.jsp';</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	}
	
}
