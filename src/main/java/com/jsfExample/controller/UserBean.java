package com.jsfExample.controller;

import java.awt.event.ActionEvent;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("user")
@RequestScoped
public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public String login(){
		if("manoj".equals(name)){
			return "home";
		}
		else
			return "index";
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void validateLogin(ActionEvent event){
		System.out.println(event.getSource().toString());
	}
}
