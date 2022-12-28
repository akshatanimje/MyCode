interface Lambda
{
	void show();
}
public class LambdaExpression 
{

	public static void main(String[] args)
	{
		Lambda obj=()->System.out.println("i am learner");
		obj.show();
	//	Lambda obj=new Lambda()
				//{
					//public void show()
					//{
						//System.out.println("i am learner");
					//}
			
				//};

	}

}
