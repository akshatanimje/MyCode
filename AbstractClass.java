class Printer
{
	public void show(Number i)//using Number instead of Integer because Integer and Double extends Number Class
	{
		System.out.println(i);//Number is abstract class
	}
}
public class AbstractClass
{

	public static void main(String[] args)
	{
		
		Printer obj=new Printer();//Number will accept integer as well as double
		obj.show(5);
	}

}
