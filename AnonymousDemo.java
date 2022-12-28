class Anon
{
	public void show()
	{
		System.out.println("anything");
	}
}
//class bnon extends Anon
//{
	//public void show() 
	//{	
		//System.out.println("i am learner");
	//}
//}
public class AnonymousDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Anon obj= new Anon()
					{
					    public void show()
						{
								System.out.println("i am learner");
						}	
		            };
		obj.show();

	}

}
