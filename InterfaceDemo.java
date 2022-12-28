interface Writer
{
	void write();
	
}
class Pen implements Writer
{
	public void write()
	{
		System.out.println(" i am pen");
	}
}
class Pencil implements Writer
{
	public void write()
	{
		System.out.println("i am pencil");
	}
}
class Kit
{
	public void doSomething(Writer pe)
	{
		pe.write();
	}
}
public class InterfaceDemo 
{

	public static void main(String[] args)
	{
		
		Kit k=new Kit();
		Writer pe=new Pen();
		Writer pc=new Pencil();
		k.doSomething(pc);
		
	}

}
