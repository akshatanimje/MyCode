
public class ThreadPriority
{
	public static void main(String[] args) throws Exception
	{
		Thread t1=new Thread(() ->
	       {
		      for(int i=0;i<=5;i++)
		      {
			     System.out.println("Hi"+ Thread.currentThread().getPriority());//to get the priority in thread itself
			     try
			     {
				     Thread.sleep(1000);//method which we used to suspend our thread,500msec=half sec
			     }
			     catch(Exception e)
			     {
				
			     }
		       }
	       });//},"Hi thread");
		Thread t2=new Thread(()->
     { 
	         
	        	for(int i=0;i<=5;i++)
	        	{
	        		System.out.println("HELLO"+Thread.currentThread().getPriority());
	        		try
	        		{
	        			Thread.sleep(1000);//method which we used to suspend our thread,500msec=half sec
	        		}
	        		catch(Exception e)
	        		{
				
	        		}
	        	}
     });//},"Hello thread");
		
//		t1.setName("hii thread");// WE can set the name of thread on our own 
//		t2.setName("Hello thread");
//		
//		System.out.println(t1.getName());//We can get the by default name of thread 
//		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);//setting the priority
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());//fetching the default priority
		System.out.println(t2.getPriority());
		
		t1.start();//start will call run method
		try
		{
			Thread.sleep(10);//method which we used to suspend our thread,10msec
		}
		catch(Exception e)
		{
			
		}
	    t2.start();
	    
	   // Multithreading Join and isAlive Method
	    //System.out.println(t1.isAlive());
	    t1.join();
	    t2.join();
	    System.out.println(t2.isAlive());
	    
	    System.out.println("Bye");

	}

}
