import java.util.ArrayList;
import java.util.List;


public class GenericsWithList
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List <Integer> values=new ArrayList<>();//List support index numbers//In generics we have to be specific with vales type
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2, 2);
		//values.add("name");
		
//		for (int i=0;i<values.size();i++)
//		{
//			System.out.println(values.get(i));
//		}

		for(Integer o:values)//enhanced for loop
		{
			System.out.println(o);
		}
		
		


	}

}
