public class ExceptionPropagation
{
	public void first()
	{
		int data=50/0;
	}
	public void second()
	{
		first();
	}
	public void third()
	{
		try
		{
			second();
		}
		catch(Exception e)
		{
			System.out.println("Done");
		}
	}
	public static void main(String args[])
	{
	ExceptionPropagation ob = new ExceptionPropagation();
		ob.third();
		System.out.println("Bye");
	}
}