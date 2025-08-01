import java.io.*;
class FilesPath
{
	public static void main(String args[])
	{
	 File obj1 = new File("C:\\LPU\\Term 4\\Subjects\\Java\\interfaceshapeEx.java");
	 System.out.println(obj1.getName());
	 System.out.println(obj1.isFile());
	 System.out.println(obj1.isDirectory());
	 File dir1=new File("c:\\java");
	 System.out.println(dir1.isFile());
	 System.out.println(dir1.isDirectory());
	}
}