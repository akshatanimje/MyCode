import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadDataFromTextFileMethod1
{

	public static void main(String[] args) throws IOException
	{
		// Using FileReader BufferReader
//		FileReader fr=new FileReader("C:\\Java Practice\\Test.txt");
//		BufferedReader br=new BufferedReader(fr);
//		
//		String str;
//		while((str=br.readLine())!=null)
//		{
//			System.out.println(str);
//		}
//		br.close();

		Properties properties = new Properties();


		InputStream stream = new FileInputStream(new File("C:\\Users\\akshata_nimje\\config.properties"));
		properties.load(stream);
		String name = properties.getProperty("name");
		System.out.println(name);
		System.out.println(properties.getProperty("interest"));
//		



	}

}
