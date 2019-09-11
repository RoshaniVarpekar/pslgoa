package com.springmvcone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;
	public boolean check(String login,String password)
	{
		if(loginDAO.check(login, password))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
}
