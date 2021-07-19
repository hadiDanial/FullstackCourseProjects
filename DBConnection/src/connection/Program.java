package connection;

import java.sql.SQLException;

public class Program
{

	public static void main(String[] args)
	{
		try
		{
			DBConnection db = new DBConnection();
//			for (int i = 0; i < 10; i++)
//			{
//				db.runSQL();			
//			}

			db.createProductsTable();
			db.insertSampleProducts();
			db.readAll();
//			db.dropProductsTable();
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
