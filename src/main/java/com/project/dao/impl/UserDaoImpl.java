package com.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.dao.UserDao;
import com.project.dto.UserDTO;
import com.project.utility.DbConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean saveUser(UserDTO user) {
		
		Connection con = null;
		PreparedStatement ps = null;	
		try {
			con = DbConnection.establiConnection();
			if(con!=null) {
				System.out.println("Connected");
			}else {
				System.out.println("Not Connected");
			}
			ps = con.prepareStatement("insert into tbl_signup(name,email,password,address) values(?,?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getAddress());

			int rows = ps.executeUpdate();
			if (rows > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
