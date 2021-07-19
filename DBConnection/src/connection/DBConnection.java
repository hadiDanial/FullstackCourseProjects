package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public int runSQL(String sql) throws SQLException
	{
		System.out.println("Executing " + sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		int res = preparedStatement.executeUpdate();
		
		// Return the generated ID key
		ResultSet result = preparedStatement.getGeneratedKeys();
		if(result.next())
		{
			return result.getInt(1);
		}
		throw new SQLException();
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
	
	public ResultSet readAllResult() throws SQLException
	{
		String sql = "select * from products";
		Statement statement = connection.createStatement();
		return statement.executeQuery(sql);
	}
	
	public void readAll() throws SQLException
	{
		String sql = "select * from products";
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery(sql);
		while(res.next())
		{
			int id = res.getInt("barcode");
			String name = res.getString("name");
			int price = res.getInt("price");
			
			System.out.println(id + ". " + name + " - " + price);
		}
	}
	
	public void insertSampleProducts() throws SQLException
	{
		String sql = "insert into products(name, price, description) values ('Bread', 1, 'A piece of bread.');"
				+ "insert into products(name, price, description) values ('Apple', 10, 'An apple!');"
				+ "insert into products(name, price, description) values ('Cola', 20, 'A bottle of cola');"
				+ "insert into products(name, price, description) values ('iPhone', 3500, 'An iPhone. How expensive...');"
				+ "insert into products(name, price, description) values ('Cake', 50, 'Yummy!');"
				+ "insert into products(name, price, description) values ('Chocolate bar', 3, 'Tasty');";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int res = preparedStatement.executeUpdate();

	}	
	public void clearProductsTable() throws SQLException
	{
		String sql = "delete from products";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int res = preparedStatement.executeUpdate();
	}
	
	public void createProductsTable() throws SQLException
	{
		String sql = "create table products("
				+ "barcode int identity(1,1) Primary Key,"
				+ "name varchar(MAX),"
				+ "price int,"
				+ "description text);";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
	}
	public void dropProductsTable() throws SQLException
	{
		String dropTable = "drop table products";
		PreparedStatement preparedStatement = connection.prepareStatement(dropTable);
		preparedStatement.executeUpdate();
	}
}
