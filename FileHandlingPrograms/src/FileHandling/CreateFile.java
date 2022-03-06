package FileHandling;
import java.io.File;//import the File class
import java.io.IOException;//import the IOException class to handle exception errors
public class CreateFile 
{
	public static void main(String[] args) 
	{
		try
		{
			File obj=new File("D:\\Java Programs\\FileHandling\\createfile.txt");
			if(obj.createNewFile())
			{
				System.out.println("File Created Successfully :"+obj.getName());
			}
			else
			{
				System.out.println("File Already Exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception : Something is Occured so,Exception is Handling");
			e.printStackTrace();
		}
	}

}
