import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo
{

	public static void main(String[] args) 
	{
		Collection values=new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		//System.out.println(values);//print all the value in one line
		
		Iterator it = values. iterator();//which fetch the value from Collection(one-one value)
		
//		System.out.println(it.next());//print one by one values
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while(it.hasNext())//check if we have next element or not
		{
			System.out.println(it.next());
		}
		
		

	}

}
