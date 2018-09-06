package week7_A2_JDBC_Exercises_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class AbstractDAO {
		
	protected Connection conn;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "c##adam";
			String pass = "password";
			
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			conn.close();
		} catch(Exception e) {}
	}	
}
