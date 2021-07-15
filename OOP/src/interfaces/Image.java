package interfaces;

public class Image implements Printable 
{
	private String path;
	private String date;
	
	public Image(String path, String date) 
	{
		super();
		this.path = path;
		this.date = date;
	}
	
	protected String getPath() 
	{
		return path;
	}

	protected void setPath(String path) 
	{
		this.path = path;
	}

	protected String getDate() 
	{
		return date;
	}

	protected void setDate(String date) 
	{
		this.date = date;
	}

	@Override
	public void print() 
	{
		System.out.println("Image from: " + date + " - Path: " + path);

	}

}
