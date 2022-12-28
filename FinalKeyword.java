class Aa
{
	public final void show()//using final keyword with variable we cannot cahnge the value of variable
	{
		System.out.println("in A show");
	}
}

class Bb extends Aa//using final keyword with class we cannot extends that class
{
//	public void show()
	{
		System.out.println("in B show");//using final keyword with method we cannot override that class
	}
}
public class FinalKeyword
{

	public static void main(String[] args)
	{
		Bb obj=new Bb();
		obj.show();

	}

}
