class Hii implements Runnable//runnable is interface have only one method i.e run()
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("HI");
			try
			{
				Thread.sleep(500);//method which we used to suspend our thread,500msec=half sec
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class Helloo implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("HELLO");
			try
			{
				Thread.sleep(500);//method which we used to suspend our thread,500msec=half sec
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
public class ThreadInterface 
{

	public static void main(String[] args)
	{
		Runnable obj1=new Hii();
		Runnable obj2=new Helloo();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();//start will call run method
		try
		{
			Thread.sleep(10);//method which we used to suspend our thread,10msec
		}
		catch(Exception e)
		{
			
		}
	    t2.start();

	}

}
