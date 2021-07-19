package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection
{
	private static String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String connectionString = "jdbc:sqlserver://127.0.0.1:1433;databaseName=TsofenDB;integratedSecurity=true";
	private static int count = 15;
	private Connection connection;
	public DBConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Loading Driver");
		Class.forName(driverClass);
		System.out.println("Driver Success");
		
		System.out.println("Trying to connect");
		connection = DriverManager.getConnection(connectionString);
		System.out.println("Connection successful");
	}
	
	public void runSQL() throws SQLException
	{
		String sql = "insert into products(name, price, description) values ('Snickers"+count +"', 4, 'You''re not yourself when you''re hungry!');";
		System.out.println("Executing " + sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		int res = preparedStatement.executeUpdate();
		
		// Return the generated ID key
		ResultSet result = preparedStatement.getGeneratedKeys();
		if(result.next())
		{
			int id = result.getInt(1);
			System.out.println("Generated id is: " + id);
		}
		count++;
		System.out.println("SQL " + sql + " executed successfully, code " + res + ".");
	}
}
