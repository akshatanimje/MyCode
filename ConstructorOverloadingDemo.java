class Casioo
{
	int num1;
	int num2;
	String operation;
	
	public Casioo()
	{
		num1=0;
		num2=4;
		operation="nothing";
	}
	public Casioo(int i, int j)
	{
		num1=i;
		num2=j;
		operation="nothing";
	}
	public Casioo(int i,int j, String op)
	{
		num1=i;
		num2=j;
		operation=op;
	}
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args)
	{
		Casioo obj =new Casioo(7,8,"add");
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.operation);
	}
	

}
