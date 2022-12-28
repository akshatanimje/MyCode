interface Abcd
{
	void show();
}
public class AnonymousInterface 
{

	public static void main(String[] args) //we can create a object of interface using a anonymous class
	{
		Abcd obj=new Abcd()
				{
					public void show()//anonymous class
					{
						System.out.println("I am learner");
					}
				};
		obj.show();

	}

}
