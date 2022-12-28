
public class MultithreadingLambdaExpression
{
	public static void main(String[] args) throws Exception
	{
//		Runnable obj1=() ->
//			       {
//				      for(int i=0;i<=5;i++)
//				      {
//					     System.out.println("Hi");
//					     try
//					     {
//						     Thread.sleep(500);//method which we used to suspend our thread,500msec=half sec
//					     }
//					     catch(Exception e)
//					     {
//						
//					     }
//				       }
//			       };
//				
//		Runnable obj2=()->
//		           { 
//			         
//			        	for(int i=0;i<=5;i++)
//			        	{
//			        		System.out.println("HELLO");
//			        		try
//			        		{
//			        			Thread.sleep(500);//method which we used to suspend our thread,500msec=half sec
//			        		}
//			        		catch(Exception e)
//			        		{
//						
//			        		}
//			        	}
//		           };
				
		
		Thread t1=new Thread(() ->
	       {
		      for(int i=0;i<=5;i++)
		      {
			     System.out.println("Hi");
			     try
			     {
				     Thread.sleep(500);//method which we used to suspend our thread,500msec=half sec
			     }
			     catch(Exception e)
			     {
				
			     }
		       }
	       });
		Thread t2=new Thread(()->
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
        });
		
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
