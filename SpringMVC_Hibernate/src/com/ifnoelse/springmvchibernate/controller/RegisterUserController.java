package com.ifnoelse.springmvchibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ifnoelse.springmvchibernate.ibiz.IRegisterUserBiz;
import com.ifnoelse.springmvchibernate.model.User;

@Controller
@RequestMapping("/register")
public class RegisterUserController {
	
	@Autowired
	private IRegisterUserBiz registerUserBiz;

	public IRegisterUserBiz getRegisterUserBiz() {
		return registerUserBiz;
	}

	public void setRegisterUserBiz(IRegisterUserBiz registerUserBiz) {
		this.registerUserBiz = registerUserBiz;
	}
	
	@RequestMapping("/register.do")
	public String register(User user) {
		if (registerUserBiz.isExist(user.getUsername())) {
			return "error";
		}
		else {
			registerUserBiz.addUser(user);
			return "success";
		}
	}
}
