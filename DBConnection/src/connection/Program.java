package connection;

import java.sql.SQLException;

public class Program
{

	public static void main(String[] args)
	{
		try
		{
			DBConnection db = new DBConnection();
			for (int i = 0; i < 10; i++)
			{
				db.runSQL();			
			}
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
