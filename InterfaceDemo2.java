interface Abc
{
	void show();
}
class Implementor implements Abc
{
	public void show()
	{
		System.out.println("anything");
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Abc obj=new Implementor();
		obj.show();
	}

}
