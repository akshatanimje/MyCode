//Encapsulation binding data with methods
//getters and setters
class Student
{
	private int rollno;
	private String name;
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}
public class EncapsulationDemo
{

	public static void main(String[] args) 
	{
		Student S1=new Student();
		S1.setRollno(2);
		S1.setName("Navin");
		System.out.println(S1.getRollno());
		System.out.println(S1.getName());
		
		

	}

}
