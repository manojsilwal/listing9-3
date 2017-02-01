package com.jsfExample.controller;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.jsfExample.Password")
public class PasswordValidator implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
		// TODO Auto-generated method stub
		String pass = (String) arg2;
		if(pass.contains("@")){
			throw new ValidatorException(new FacesMessage("password cannot contain @"));
		}
	}
		
}
