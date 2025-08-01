interface MyInterface
{
	String runMyMethod(String str);
}
public class LambdaEx
{
	public static void main(String args[])
	{	
	MyInterface exclaim= (s) -> s +"!";
	MyInterface ask= (s) -> s +"?";
	String result1=exclaim.runMyMethod("Hello");
	System.out.println(result1);
	String result2=ask.runMyMethod("Hello");
	System.out.println(result2);
	}
}