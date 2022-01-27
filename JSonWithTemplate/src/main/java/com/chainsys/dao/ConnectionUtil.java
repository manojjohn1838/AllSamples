package com.chainsys.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getDbConnection()
	{
		Connection con=null;
		try
		{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return con;
		
	}

}
