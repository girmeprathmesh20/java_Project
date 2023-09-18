package com.project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.UserDTO;
import com.project.service.UserService;
import com.project.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private UserService userService;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("username");
		String password = req.getParameter("password");
		String address = req.getParameter("city");
		
		UserDTO user = new UserDTO(name, email, password, address);
		userService = new UserServiceImpl();
		boolean isUserSaved = userService.saveUser(user);
		if(isUserSaved==true) {
			resp.sendRedirect("success.jsp");
		}else {
			resp.sendRedirect("error.jsp");
		}
		
	}

}
