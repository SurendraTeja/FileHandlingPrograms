package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter obj=new FileWriter("D:\\Java Programs\\FileHandling\\createfile.txt");
			obj.write("This is Surendra Teja and i am working in VolkSoft Technologies in Secundrabad");
			obj.close();
			System.out.println("File was Successfully wrote");
		}
		catch(IOException e)
		{
			System.out.println("Exception : Something is Occured so,Exception is Handling");
			e.printStackTrace();
		}
	}

}
