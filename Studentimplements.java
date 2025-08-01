import java.io.*;
class Student implements Serializable
{
	int roll;
	String name;
	public student(int roll, String name)
	{
		this.rool = roll;
		this.name =name;
	}
}
public class StudentSerializableTest
{
	public static void main(String[] args) thros IOException,ClassNotFoundException
	{
		Student stu1 = new Student(101, "Mr. x");
		//serializing
		FileOutputStream fos = new FileOutputStream("Data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu1);
		
		oos.close();
		fos.close
	}
}
		
		