import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{
	private static DBConnection instance;

	private static String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String connectioniString = "jdbc:sqlserver://127.0.0.1:1433;databaseName=TsofenDB;integratedSecurity=true";
	private Connection connection;

	private DBConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Loading sql server driver");
		Class.forName(driverClass);
		System.out.println("Driver loaded successfully");

		System.out.println("Connecting to database...");

		connection = DriverManager.getConnection(connectioniString);

		System.out.println("Connection successfully");
	}

	public static DBConnection getInstance() throws ClassNotFoundException, SQLException
	{
		if (instance == null)
		{
			instance = new DBConnection();
		}
		return instance;
	}

	public int runInsertSQL(String sql) throws SQLException
	{
		System.out.println("Executing " + sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

		int res = preparedStatement.executeUpdate();

		ResultSet result = preparedStatement.getGeneratedKeys();
		if (result.next())
		{
			return result.getInt(1);
			// System.out.println("Generated id is : "+id);
		}
		throw new SQLException();
		// System.out.println("sql "+sql+" executed successfully, records affected
		// "+res);
	}

	public int runUpdateOrDeleteSQL(String sql) throws SQLException
	{
		System.out.println("Executing " + sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		return preparedStatement.executeUpdate();
	}

	public ResultSet read(String sql) throws SQLException
	{
		Statement statement = connection.createStatement();
		return statement.executeQuery(sql);
	}

}
