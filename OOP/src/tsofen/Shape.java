package tsofen;

public abstract class Shape {
	private String color;
	

	public Shape(String color) 
	{
		this.color = color;
	}
	public abstract float calculateSize();
	public abstract float calculatePermiter();
	
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
}
