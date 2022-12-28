interface Domo
{
	void abc();//abstract method
	default void show()//default method
	{
		System.out.println("in show");
	}
}
class DomoImp implements Domo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	public void show()//override method
	{
		System.out.println("in new show");
	}
}
public class DefaultMethodsInterface {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Domo obj=new DomoImp();
		obj.abc();
		obj.show();
		

	}

}
