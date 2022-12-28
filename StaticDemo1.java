class Empp
{
	int eid;
	int salary;
	static String ceo;
	
    static
    {
	   ceo="larry";
	   System.out.println("in static");
    }
    public Empp	()
    {
    	eid=1;
    	salary=3000;
    	System.out.println("in constructor");
    }
    public void show()
    {
    	System.out.println(eid+ ":" +salary+ ":" +ceo);
    }
}
public class StaticDemo1
{

	public static void main(String[] args) 
	{
		
		Empp navin=new Empp();
		Empp rahul=new Empp();
		
		navin.show();
		rahul.show();
	}

}
