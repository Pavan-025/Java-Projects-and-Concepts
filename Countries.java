import java.util.*;
public class Countries
{
	public static void main(String[] args)
	{
		Set<String> countries = new TreeSet<String>();
		countries.add("Japan");
		countries.add("Japan");
		System.out.println("Countries = "+countries);
		countries.add("Japan");
		System.out.println("Countries = "+countries);
		countries.add("Japan");
		System.out.println("Countries = "+countries);
		countries.remove("Japan");
		System.out.println("Countries = "+countries);
	}
}