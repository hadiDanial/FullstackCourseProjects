package tsofen;

public class Circle extends Shape 
{
	private float radius;

	public Circle(String color, float radius) 
	{
		super(color);
		this.radius = radius;
	}

	
	@Override
	public float calculateSize() 
	{
		return (float) Math.PI * radius * radius;
	}

	@Override
	public float calculatePermiter() 
	{
		return 2 * (float)Math.PI * radius;
	}

}
