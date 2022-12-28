class Hi extends Thread
{
	public void run()//show()//run is internal method of thread
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
class Hello extends Thread//show()//whenever we extends thread we have to start it
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
public class ThreadDemo {

	public static void main(String[] args) //'main' is main thread by default
	{
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		obj1.start();//start will call run method
		try
		{
			Thread.sleep(10);//method which we used to suspend our thread,10msec
		}
		catch(Exception e)
		{
			
		}
		obj2.start();
		
//		obj1.show();
//		obj2.show();

	}

}
