import assignment.Manager;
import assignment.Programmer;
import assignment.Clerk;
import assignment.Employee;
import java.io.*;


public class Menu
{
	int choice1=0;
	int choice2=0;
	ArrayList<Employee> arr = new ArrayList<Employee>();

	public static void main(String args[])
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	while(choice1!=5)
	{
		
		System.out.println("CHOOSE FROM MENU");
		System.out.println("1. CREATE ");
		System.out.println("2. DISPLAY ");
		System.out.println("3. RAISE SALARY ");
		System.out.println("4. EXIT ");
		System.out.println("Enter choice:-");
		choice1=Integer.parseInt(br.readLine());

		switch(choice1)
		{
			
			case 1:
					while(choice2!=4)
					{

					System.out.println("CHOOSE FROM SUB MENU");
					System.out.println("1. Clerk ");
					System.out.println("2. Manager ");
					System.out.println("3. Programmer ");
					System.out.println("4. Exit ");
					System.out.println("Enter sub choice:-");
					choice2=Integer.parseInt(br.readLine());

					switch(choice2)
					{
						case 1: {
							Employee c1 = new Clerk();
							arr.add(c1); 
							break;
							}

						case 2:{
							Employee c2=new Programmer();
							arr.add(c2);
							break;
							}


						case 3:{
							Employee c3=new Manager();
							arr.add(c3);
							break;
							}


						case 4:break;
							


						default:{
							System.out.println("INVALID");
							break;
							}

						
					}
				}break;

			case 2:{
					for(int i =0; i<arr.size(); i++)
					{
						arr.get(i).display();
						
					} 
					break;
				}

			case 3:{
				for(int i =0; i<arr.size(); i++)
					{
						arr.get(i).raiseSalary();
						
					}
				}

			case 4:{
				System.out.println("EMPLOYEE COUNT:"+Employee.counter);
				break;
				}

			default:{
					System.out.println("INVALID");
					break;
				}


		}

		}
	}
}
