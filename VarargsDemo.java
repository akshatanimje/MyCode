class Var
{
	public int add(int...i)//variable length arguments
	{
		int sum=0;
		for(int k:i)
		{
			sum=sum+k;
		}
		return sum;
	}
}
public class VarargsDemo
{

	public static void main(String[] args)
	{
		Var obj=new Var();
		//obj.add(4,5);
        System.out.println(obj.add(4,5));
	}

}
