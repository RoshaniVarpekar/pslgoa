package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("loginDAO")
public class LoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public boolean check(String login,String password)
	{
		String query = "select * from users";
		String name,pass;
		List<User> users=jdbcTemplate.query(query, new BeanPropertyRowMapper<User>(User.class));
		for (User user : users) {
			name=user.getLogin();
			pass=user.getPassword();
			if(login.equals(name)&&password.equals(pass))
			{
				return true;
			}
		}
		return false;
		
	}
}
