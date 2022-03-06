package FileHandling;
import java.io.File;
public class FileInformation
{
	public static void main(String[] args) 
	{
		File obj=new File("D:\\Java Programs\\FileHandling\\createfile.txt");
		if(obj.exists())
		{
			System.out.println("File Name is :"+obj.getName());//display file name and file type
			System.out.println("Absolute Path :"+obj.getAbsolutePath());//display the exact file location
			System.out.println("Writable :"+obj.canWrite());//display true if file type is writable,and not writable if false
			System.out.println("Readble :"+obj.canRead());//display true if file type is readable,and not readable if false
			System.out.println("File Size in bytes :"+obj.length());//display the size of file,if file exists
		}
		else
		{
			System.out.println("File does not Exists");
		}
	}

}
