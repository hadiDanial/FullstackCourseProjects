package factory;

public class Option
{
	private String message;
	private Action action;

	public Option(String message, Action action)
	{
		super();
		this.message = message;
		this.action = action;
	}

	protected String getMessage()
	{
		return message;
	}
	public void performAction()
	{
		action.performAction();
	}
	@Override
	public String toString()
	{
		return message;
	}
}
