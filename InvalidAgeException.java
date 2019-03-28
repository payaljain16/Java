package assignment;
import java.util.*;

class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
	}

	public InvalidAgeException(String msg)
	{
		super(msg);
	}
	
	public int readEmpAge()
	{
		int age=0;
		while(true)
		{
			try
			{
				System.out.print("Enter age:");	
				age=new Scanner(System.in).nextInt();
				if(age<21 || age>60)
					throw new InvalidAgeException();
				return age;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter number only");
			}
			catch(InvalidAgeException e)
			{
				System.out.println("Please enter between 21 and 60");
			}
		}

	}
}