package tsofen;

public class Rectangle extends Shape 
{

	private float width, height;
	public Rectangle(String color, float width, float height) 
	{
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public float calculateSize() 
	{
		return width * height;
	}

	@Override
	public float calculatePermiter() 
	{
		return 2 * (width + height);
	}

}
