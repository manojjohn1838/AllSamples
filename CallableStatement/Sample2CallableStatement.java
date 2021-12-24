import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Sample2CallableStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {		  
	    	  Connection con=ConnectionUtil.getDBConnect();
	    	  CallableStatement stmt = con.prepareCall("{?=call Adder (?,?)}");
	        
	    	  stmt.setInt(2, 20);
	    	  stmt.setInt(3, 30);
	    	  stmt.registerOutParameter(1, Types.INTEGER);
	         
	         System.out.println(stmt.execute());
	    	  System.out.println(stmt.getInt(1));
	    	  
	    	  CallableStatement stmt1 = con.prepareCall("{?=call selectq1 (?)}");
		        
	    	 stmt1.setString(2, "manoj");
	    	  stmt1.registerOutParameter(1, Types.INTEGER);
	         
	         System.out.println(stmt1.execute());
	    	  System.out.println(stmt1.getInt(1));
	    	  
	    	  
	    	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
