class C
{
	public void show()
	{
		System.out.println("in C");
	}
}
class D extends C
{
	public void show()
	{
	   
	   System.out.println("in D");
	}
}
public class MrthodoverridingDemo
{

	public static void main(String[] args)
	{
		
      D obj=new D();
      obj.show();
    }

}
