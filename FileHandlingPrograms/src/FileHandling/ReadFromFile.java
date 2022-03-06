package FileHandling;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFromFile 
{
	public static void main(String[] args) 
	{
		try
		{
			File obj=new File("D:\\Java Programs\\FileHandling\\createfile.txt");
			Scanner scan=new Scanner(obj);
			while(scan.hasNext())
			{
				String data=scan.nextLine();
				System.out.println(data);
			}
			scan.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception : Something is Occured so,Exception is Handling");
			e.printStackTrace();
		}
	}
}
