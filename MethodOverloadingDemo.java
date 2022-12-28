class Casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j, int k)
	{
		System.out.println(i+j+k);
	
	}
	public void add(double d,double b)
	{
		System.out.println(d+b);
	}
}
public class MethodOverloadingDemo
{

	public static void main(String[] args) 
	{
		
		Casio obj=new Casio();
		obj.add(4, 5);
		obj.add(6, 7,8);
		obj.add(7.6,8.5);
		
	}

}
