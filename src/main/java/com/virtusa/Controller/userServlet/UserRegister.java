package com.virtusa.Controller.userServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.DBConnect;
import com.virtusa.Service.UserService;
import com.virtusa.dao.UserDao;
import com.virtusa.entity.User;

@WebServlet("/user-register")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fullName=req.getParameter("firstname");
		String lastName=req.getParameter("lastname");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String phoneNumber=req.getParameter("phonenumber");
		String role="user";

		User u=new User(fullName,lastName,email,password,phoneNumber,role);
		//UserDao userdao=new UserDao(DBConnect.getConnection());
		UserService userservice=new UserService(DBConnect.getConnection());
		HttpSession session=req.getSession();
		boolean f=userservice.userRegister(u);

		if(f) {
			session.setAttribute("successMessage","Register Successful" );
			resp.sendRedirect("user-login.jsp");
		}else {
			session.setAttribute("errorMessage","Enter the correct details!!" );
			resp.sendRedirect("user-registration.jsp");
		}

	}
}

