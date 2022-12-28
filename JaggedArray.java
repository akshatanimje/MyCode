
public class JaggedArray
{

	public static void main(String[] args)//jagged array
	{
		int d[][]= {
				     {2,3,4},
				     {2,4,6,7},
				     {5,7,8,2,9}
		};
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}

	}

}
