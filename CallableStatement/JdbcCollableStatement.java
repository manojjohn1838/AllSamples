import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class JdbcCollableStatement {

	public static void main(String[] args) {
	      // Open a connection
	      try {		  
	    	  Connection con=ConnectionUtil.getDBConnect();
	    	  CallableStatement stmt = con.prepareCall("{call INSERTQ (?,?,?)}");
	        
	         stmt.setString(1, "manoj");
	         stmt.setInt(2, 1000);
	         stmt.setString(3, "Nellai");
	         
	         System.out.println(stmt.executeUpdate());
	    	  System.out.println(stmt.getUpdateCount());
	    	  
	    	  
	    	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }

}
