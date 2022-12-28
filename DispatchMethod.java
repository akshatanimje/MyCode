class F
{
	public void show()
	{
		System.out.println("in A");
	}
}
class E extends F
{
	public void show()
	{
		System.out.println("in B");
	}
}
class G extends A
{
	public void show()
	{
		System.out.println("in C");
	}
}
public class DispatchMethod 
{

	public static void main(String[] args)
	{
		
		F obj=new E();
		obj.show();
		
		 G obj1=new G();//dynamic method dispatched
		obj1.show();

	}

}
