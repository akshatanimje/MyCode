import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionListInterface 
{

	public static void main(String[] args) 
	{
		List values=new ArrayList();//List support index numbers
		values.add(4);
		values.add(6);
		values.add(9);
		//values.add(2, 2);
		values.add("name");
		
//		for (int i=0;i<values.size();i++)
//		{
//			System.out.println(values.get(i));
//		}

		for(Object o:values)//enhanced for loop
		{
			System.out.println(o);
		}
		
		


	}

}
