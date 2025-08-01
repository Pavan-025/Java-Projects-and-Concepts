class ExceptionFinallyEx
{
	public static void main(String args[])
	{
		try
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int z=x/y;
			System.out.println("result of division is:"+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:Variable y must be non-zero");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error:Arguments must be Numeric");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error:Invalid Number of arguments");
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("Bye");
	}
}