class Counter
{
	int count;
	public synchronized void increament()
	{
		count++;
	}
}
public class MultithreadingSynchronizedKeyword
{

	public static void main(String[] args) throws Exception
	{
		
		Counter c=new Counter();
		c.increament();//it will give count 1 and if we call increament for 2 times it will give count 2
		c.increament();
		
		Thread t1=new Thread(new Runnable()//to call increament 1000 times we create thread
				{
					public void run()
					{
						for(int i=1;i<=1000;i++)
						{
							c.increament();
						}
					}
				});
		
		Thread t2=new Thread(new Runnable()//to call increament 1000 times we create thread
				{
					public void run()
					{
						for(int i=1;i<=1000;i++)
						{
							c.increament();
						}
					}
				});
		
		t1.start();
		t2.start();
		
		t1.join();//asking our main thread to wait for t1
		t2.join();
		
		
		System.out.println("Count" + c.count);
	}

}
