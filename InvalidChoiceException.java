package assignment;
import java.util.*;

public class InvalidChoiceException extends Exception
{
	public InvalidChoiceException()
	{
	}

	public InvalidChoiceException(String msg)
	{
		super(msg);
	}
	
	public int readEmpChoice()
	{
		int choice=0;
		while(true)
		{
			try
			{
				System.out.print("Enter choice:");	
				choice=new Scanner(System.in).nextInt();
				if(choice<1 || choice>4)
					throw new InvalidChoiceException();
				return choice;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter number only");
			}
			catch(InvalidChoiceException e)
			{
				System.out.println("Please enter between 1 and 4");
			}
		}

	}
}