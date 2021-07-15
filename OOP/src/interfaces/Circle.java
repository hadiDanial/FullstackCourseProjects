package interfaces;

public class Circle extends Shape 
{
	private double radius;
	public Circle(String color, double radius) 
	{
		super(color);
		this.radius = radius;
	}

	@Override
	public double diameter() 
	{
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() 
	{
		return Math.PI * radius * radius;
	}

	@Override
	public String getShapeDetails() 
	{
		return "Circle(radius = " + radius + ")";
	}

}
