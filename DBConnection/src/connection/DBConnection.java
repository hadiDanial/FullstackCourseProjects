package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	private static String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String connectionString = "jdbc:sqlserver://127.0.0.1:1433;databaseName=TsofenDB;integratedSecurity=true";

	public DBConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Loading Driver");
		Class.forName(driverClass);
		System.out.println("Driver Success");
		
		System.out.println("Trying to connect");
		Connection connection = DriverManager.getConnection(connectionString);
		System.out.println("Connection successful");
	}
}
