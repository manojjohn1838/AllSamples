package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.model.User;

public class UserDao {
	
	public List<User> showUsers() throws SQLException
	{
		List<User> userList=new ArrayList <User>();
		String query="select user_name,mobile_number from user_cafe";
		Connection con=ConnectionUtil.getDbConnection();
		ResultSet rs=null;
		PreparedStatement preStmt=null;
		try {
			preStmt=con.prepareStatement(query);
			rs=preStmt.executeQuery();
			while(rs.next())
			{
				userList.add(new User(rs.getString(1), rs.getLong(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				rs.close();
				
			}
			if(preStmt!=null)
			{
				preStmt.close();
			}
			if(con!=null)
			{
				con.close();
				
			}
		}
		return userList;
		
	}

}
