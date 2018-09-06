package week7_A2_JDBC_Exercises_2;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new OracleDriver());

	}

}
