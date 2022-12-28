import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{

	public static void main(String[] args)
	{
//		values.add(5);
//		values.add(6);
//		values.add(9);
//		values.add(6);
		
		//Set<Integer> values=new HashSet<>();//in set u cannot add duplicate value//HashSet will not give u values in sequence
		Set<Integer> values=new TreeSet<>();//TreeSet will give u values in acsending order
		
		System.out.println(values.add(5));
		System.out.println(values.add(6));
		System.out.println(values.add(9));
		System.out.println(values.add(6));
	
		for(int i:values)
		{
			System.out.println(i);
		}

	}
}
