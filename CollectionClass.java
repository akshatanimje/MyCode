import java.util.ArrayList;
import java.util.Collections;//Collections is class
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List <Integer> values=new ArrayList<>();//List support index numbers//In generics we have to be specific with vales type
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2, 2);
		
		Collections.sort(values);//it will print in ascending order
		Collections.reverse(values);//it will print in descending order
		Collections.shuffle(values);
	
		for(Integer o:values)//enhanced for loop
		{
			System.out.println(o);
		}
		
		


	}

}
