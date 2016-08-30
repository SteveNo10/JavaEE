package com.ifnoelse.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.ifnoelse.ssh.biz.UserBiz;
import com.opensymphony.xwork2.ActionSupport;

public class AddUserAction extends ActionSupport {

	private static final long serialVersionUID = 312068097512754574L;
	
	@Autowired
	private UserBiz userBiz;

	public UserBiz getUserBiz() {
		return userBiz;
	}
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String AddUser() {
		if (userBiz.IsExist(username)) {
			return ERROR;
		}
		
		userBiz.Save(username, password);
		return SUCCESS;
	}
}
