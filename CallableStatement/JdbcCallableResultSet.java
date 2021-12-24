import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.internal.OracleTypes;

public class JdbcCallableResultSet {
	public static void main(String[] args) {
		
		Connection con;
		try {
			con = ConnectionUtil.getDBConnect();
			
			 CallableStatement stmt1 = con.prepareCall("{?=call showsample (?)}");
		        
	    	 stmt1.setString(2, "manoj");
	    	  stmt1.registerOutParameter(1, OracleTypes.CURSOR);
	         
	         System.out.println(stmt1.execute());
	    	 ResultSet rs=(ResultSet) stmt1.getObject(1);
	    	
	    	 while(rs.next())
	    	 {
	    		 System.out.println(rs.getString(1)+"             "+rs.getInt(2)+"    "+rs.getString(3));
	    	 }
	    	  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
