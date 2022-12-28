
public class EnchancedForLoop 
{

	public static void main(String[] args) 
	{
		//int a[]= {2,3,4,5};               //one-D array
		
		//for(int k:a)
		//{
		//	System.out.print(" " + k);
		//}
		
		int d[][]= {                    //two-D array
						{2,3,4},
						{4,5,6,7},
						{3,5}
		           };                    //same for jagged array
		
		for(int k[]:d)
		{
			for(int l:k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}

	}

}
