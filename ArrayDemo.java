
public class ArrayDemo
{

	public static void main(String[] args)//2 dimentional array
	{
		int d[][]= {
						{2,3,4,5},
						{7,8,9,6},
						{5,6,1,2}
				   };
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(  " "+ d[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
