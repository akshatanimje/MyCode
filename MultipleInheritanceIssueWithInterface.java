interface Domo2
{
	void cab();
	default void show1()
	{
		System.out.println("inshow");
	}
}
interface MyDomo
{
	default void show1()
	{
		System.out.println("inMyDomoshow");
	}
}
class DomoImp2 implements Domo2,MyDomo
{
	public void cab()
	{
		System.out.println("in abc");
	}
	public void show1()
	{
		MyDomo.super.show1();
	}
}
public class MultipleInheritanceIssueWithInterface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Domo2 obj=new DomoImp2();
		obj.cab();
		obj.show1();

	}

}
