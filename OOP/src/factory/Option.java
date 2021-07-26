package factory;

public class Option
{
	private String message;

	public Option(String message)
	{
		super();
		this.message = message;
	}

	protected String getMessage()
	{
		return message;
	}
	
	@Override
	public String toString()
	{
		return message;
	}
}
