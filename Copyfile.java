import java.io.*;

class CopyFile {
    public static void main(String... s) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("C:\\LPU\\Term 4\\Subjects\\Java\\ExceptionTest.class");
        FileOutputStream fos = new FileOutputStream("C:\\LPU\\Term 4\\Subjects\\Java\\HelloPST.class");
        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
			System.out.prin((char)i);
        }
        fis.close();
        fos.close();
    }
}
