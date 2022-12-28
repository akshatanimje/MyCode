abstract class Human//abstract class
{
	public abstract void eat();//only declaration of method
	
	public void walk()
	{
		
	}
}
class Man extends Human//concrete class
{
	public void eat()
	{
		
	}
}
public class AbstractKeyword 
{

	public static void main(String[] args)
	{
		Human obj=new Man();

	}

}
