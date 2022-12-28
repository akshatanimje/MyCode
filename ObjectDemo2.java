class Calcc
{
	int num1;
	int num2;
	int result;
	
	public Calcc()//default constructor
	{
		num1=5;
		num2=5;
	}
	public Calcc(int k)
	{
		num1=k;
		num2=k;
	}
	public Calcc(double d,int n)//parameterize constructor
	{
		num1=(int) d;
		num2=n;
	}
	public void perform()
	{
		result=num1+num2;
	}
}
public class ObjectDemo2 
{

	public static void main(String[] args)
	{
		
		Calcc obj= new Calcc(7);
		//Calcc obj=new Calcc();
		obj.perform();
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.result);
	}

}
