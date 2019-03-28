import assignment.Manager;
import assignment.Programmer;
import assignment.Clerk;
import assignment.Employee;
import assignment.InvalidChoiceException;
import assignment.NameSorter;
import assignment.AgeSorter;
import assignment.SalarySorter;
import assignment.DesignationSorter;
import assignment.*;
import java.util.*;
import java.io.*;


public class EmpFile
{
	public static void main(String args[])
	{
		
		//Employee e[]=new Employee[100];
		ArrayList<Employee> e=new ArrayList<Employee>();

		File f=new File("EmployeeRecords.txt");
		f.createNewFile();
		PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
		
		int ch1=0,ch2=0,ch3=0;
		do
		{
			System.out.println("-----------------");
			System.out.println("1. CREATE ");
			System.out.println("2. DISPLAY ");
			System.out.println("3. RAISE SALARY ");
			System.out.println("4. EXIT ");

			try
			{
			System.out.println("Enter choice:-");
			ch1=new Scanner(System.in).nextInt();

			if(ch1<1 || ch1>4)
				throw new InvalidChoiceException();
			
			}
		
			catch(InputMismatchException|InvalidChoiceException ex)
			{
				ch1=new InvalidChoiceException().readEmpChoice();
			}
			if(ch1==1)
			{
				do
				{
		
					System.out.println("-----------------------------");
					System.out.println("1. Clerk ");
					System.out.println("2. Manager ");
					System.out.println("3. Programmer ");
					System.out.println("4. Exit ");
					System.out.println("Enter sub choice:-");
					ch2=new Scanner(System.in).nextInt();
					switch(ch2)
					{
						case 1:e.add(new Clerk());
							break;
						case 2:e.add(new Programmer());
							break;
						case 3:e.add(new Manager());
							break;
					}
				}while(ch2!=4);
			}
			if(ch1==2)
			{
				//Iterator<Employee> it=e.iterator();
				//for(int i=0;i<e.size();i++)
				//e.get(i).display();
				//System.out.println(e.get(i));
				/*while(it.hasNext())
				{
					//it.next().display();
					System.out.println(it.next());
				}*/
				do
				{
		
					System.out.println("-----------------------------");
					System.out.println("1. Name ");
					System.out.println("2. Age ");
					System.out.println("3. Salary ");
					System.out.println("4. Designation ");
					System.out.println("Enter sub sub choice:-");
					ch3=new Scanner(System.in).nextInt();
					switch(ch3)
					{
						case 1:Collections.sort(e,new NameSorter());
							Iterator<Employee> ite=e.iterator();
							while(ite.hasNext())
							{
								//it.next().display();
								System.out.println(ite.next());
							}
							break;
						case 2:Collections.sort(e,new AgeSorter());
							Iterator<Employee> ite1=e.iterator();
							while(ite1.hasNext()){
								//ite.next().display();
								System.out.println(ite1.next());
							}
							break;
						case 3:Collections.sort(e,new SalarySorter());
							Iterator<Employee> ite2=e.iterator();
							while(ite2.hasNext())
							{
								//it.next().display();
								System.out.println(ite2.next());
							}
							break;
						case 4:Collections.sort(e,new DesignationSorter());
							Iterator<Employee> ite3=e.iterator();
							while(ite3.hasNext())
							{
								//it.next().display();
								System.out.println(ite3.next());
							}
							break;
					}
				}while(ch3!=5);


			}
			if(ch1==3)
			{
				//for(int i=0;i<e.size();i++)
				//e.get(i).raiseSalary();
				
				Iterator<Employee> it=e.iterator();
				while(it.hasNext())
				{
					it.next().raiseSalary();
				}
				
			}			

		}while(ch1!=4);

		
		/* Employee c1=new Clerk();
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
		m1.display(); */

		//System.out.println("EMPLOYEE COUNT:"+Employee.counter);
		System.out.println("EMPLOYEE COUNT:"+e.size());
		
		
	}
}

