package exceptions;

public class AEqualToBException extends RuntimeException
{
	private static final long serialVersionUID = -586167332529820312L;

	public AEqualToBException()
	{
		super("A and B can't be equal!");
	}
}
