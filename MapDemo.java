import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{

	public static void main(String[] args)
	{
		Map<String,String> map =new HashMap<>();//HashMap is not synchronized
		//Map<String,String> map =new Hashtable<>();//HashTable is synchronized//if u want thread safty go with Hashtable
		
		map.put("myname", "Akshata");
		map.put("actor", "sidharth");
		map.put("movie", "MSD");
		map.put("actor", "akshay");
		map.put("movie", "Akshata");
		
		System.out.println(map);
		System.out.println(map.get("myname"));
		System.out.println(map.get("myname1"));//it will give null as key is not their
		Set<String> Keys=map.keySet();
		for(String key:Keys)
		{
			System.out.println(key+" "+map.get(key));
		}
	}

}
