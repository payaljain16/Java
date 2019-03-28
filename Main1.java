import Assignment.*;

public class Main1
{
	public static void main(String args[])throws IOException
	{
		Employee c1=new Clerk();
		Employee p1=new Programmer();
		Employee m1=new Manager();


		c1.display();		
		p1.display();
		m1.display();

		c1.raiseSalary();
		p1.raiseSalary();
		m1.raiseSalary();

		System.out.println("----------AFTER RAISE SALARY----------------");

		c1.display();
		p1.display();
		m1.display();

		System.out.println("EMPLOYEE COUNT:"+Employee.counter);
	}
}