import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class DB {
	public static Connection getConnection(){
		Connection c=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost/calculator", "root", "");
			
		}catch(Exception e){System.out.println(e);}
		return c;
	}

}
