package interfaces;

public abstract class Shape implements Printable
{
	private String color;

	public Shape(String color) 
	{
		super();
		this.color = color;
	}
	
	protected String getColor() 
	{
		return color;
	}
	
	protected void setColor(String color) 
	{
		this.color = color;
	}

	@Override
	public void print() 
	{
		System.out.println(color + " " + getShapeDetails() + ": diameter = " + diameter() + ", area = " + area());	
	}
	
	public abstract double diameter();
	public abstract double area();
	public abstract String getShapeDetails();
}
