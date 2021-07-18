package exceptions;

public class AGreaterThanBException extends RuntimeException
{
	private static final long serialVersionUID = -7977767346148419107L;

	public AGreaterThanBException()
	{
		super("A can't be greater than B!");
	}
}
