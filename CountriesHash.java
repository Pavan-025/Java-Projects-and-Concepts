import java.util.*;
public class CountriesHash
{
	public static void main(String[] args)
	{
		Set<String> countries = new HashSet<String>();
		countries.add("Japan");
		countries.add("India");
		System.out.println("Countries = "+countries);
		countries.add("USA");
		System.out.println("Countries = "+countries);
		countries.add("USA");
		System.out.println("Countries = "+countries);
		countries.remove("Japan");
		System.out.println("Countries = "+countries);
	}
}