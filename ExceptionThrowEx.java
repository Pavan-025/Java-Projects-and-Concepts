import java.util.*;
class ExceptionThrowEx
{
	static void demo()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("caught inside demo");
			throw e;
		}
	}
	public static void main(String args[])
	{
		try
		{
			demo();
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught:"+e);
		}
	}
}