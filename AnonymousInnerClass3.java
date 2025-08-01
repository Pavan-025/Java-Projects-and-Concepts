abstract class Person
{
	abstract void eat ();
}

class AnonymousInnerClass3
{
	public static void main(String...a)
	{
	Person p=new Person()
		{
			void eat()
			{
				System.out.println("nice fruits");
			}
		};
	p.eat();
	}
}