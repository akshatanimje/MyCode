class Single
{
	public int add(int i, int j)
	{
		return i+j;
	}
}
class Advsingle extends Single//single inheritance
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class Veryadvsingle extends Advsingle//multilevel inheritance
{
	public int multi(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo
{

	public static void main(String[] args)
	{
		Veryadvsingle S1=new Veryadvsingle();
		int resultr1=S1.add(4,5);
		int resultr2=S1.sub(6,7);
		int resultr3=S1.multi(7,8);
		System.out.println(resultr1);
		System.out.println(resultr2);
		System.out.println(resultr3);
	}

}
