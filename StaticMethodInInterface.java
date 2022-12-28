interface Static
{
	int i=8;//in interface variable is constant ,we cannot change the value of variable in interface
	void sta();
	static void see()//if we are defining static method in interface we can directly call method using interface name 
	{
		System.out.println("hii");
	}
}
//class StacticImp implements Static
//{
//	public void sta()
//	{
//		 i=9;//we get a error whhen we change the value of variable
//	}
//}

public class StaticMethodInInterface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Static.see();//we didn't need to create the object of class

	}

}
