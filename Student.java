import java.io.*;
import java.lang.*;
import java.util.*;

class Studentcmp
{
	int rollno;
	String name ,address;
	public Student(int rollno,String name,String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return this.rollno+"\t"+this.name+"\t"+this.address;
	}	
}
class SortByRoll implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.rollno-b.rollno;
	}
}
class SortByName implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.name.compareTo(b.name);
	}
}
class SortByAddress implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.address.compareTo(b.address);
	}
}
class ComparatorEx
{
	public static void main(String[] args)
	{
		ArrayList<Student>ar =new ArrayList<Student>();
		ar.add(new Student(111,"Ram","jaipur"));
		ar.add(new Student(131,"Shyam","Hyderabad"));
		ar.add(new Student(111,"Mohan","jalandhar"));
		ar.add(new Student(111,"Shiva","jaipur"));
		
		System.out.println("Unsorted");
		System.out.println("RollNo\tName\tLocation");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar,new SortByRoll());
		
		System.out.println("Unsorted");
		System.out.println("RollNo\tName\tLocation");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
	}
}