package interfaces;

public class Rectangle extends Shape 
{
	private double width, height;

	public Rectangle(String color, double width, double height) 
	{
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public double diameter() 
	{
		return 2 * (width + height);
	}

	@Override
	public double area() 
	{
		return width * height;
	}

	@Override
	public String getShapeDetails() 
	{
		return (width == height) ? "Square <" + width + ">" : "Rectangle <" + width + ", " + height + ">";
	}

}
