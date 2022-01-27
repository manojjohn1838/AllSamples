package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.UserDao;
import com.chainsys.model.User;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
@WebServlet("/ShowUserServlet")
public class ShowUserServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		UserDao userDao=new UserDao();
		List<User> userList=null;;
		try {
			userList = userDao.showUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String json=new Gson().toJson(userList);
		
		HttpSession session=req.getSession();
		session.setAttribute("userData", json);
		resp.sendRedirect("UserData.jsp");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}
