interface Cube
{
	int Compute(int x);
}
class LambdaEx4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int A = sc.nextInt();
		// lambda expression definition for Compute met
		Cube C (int X)->X*X*X;
		// Passing and returning parameters must be exa
		// same as defined in the prototype
		int Result C.Compute(A);
		System.out.println("Cube of value is "+Result);
	}
}