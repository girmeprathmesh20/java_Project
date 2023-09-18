package com.project.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.project.dao.UserDao;
import com.project.dao.impl.UserDaoImpl;
import com.project.dto.UserDTO;
import com.project.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean saveUser(UserDTO user) {
		
		boolean isUserSaved = userDao.saveUser(user);
		if(isUserSaved) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(UserDTO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(UserDTO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDTO searchUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
