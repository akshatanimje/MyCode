import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadDataFromTextFileMethod2
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// Using Scanner and File
		File file=new File("C:\\Java Practice\\Test.txt");
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

	}

}
