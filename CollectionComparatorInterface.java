import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionComparatorInterface {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		List <Integer> values=new ArrayList<>();//List support index numbers//In generics we have to be specific with vales type
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(2,102);
		
		Collections.sortb (values);//it will print in ascending order
		
	
		for(Integer o:values)//enhanced for loop
		{
			System.out.println(o);
		}
		
		

	}

}
