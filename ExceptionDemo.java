import java.io.*;

class A
{
	public void abc()throws ArithmeticException, IOException,UserException
	{
		int a=50;
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			int res=a/(a-i);
			if(i==150)
				throw new NullPointerException();
			if(i==120)
				throw new IOException();
			if(i==100)
				return;
			if(i==80)
				throw new UserException("when i is 8");
			if(i==60)
				throw new UserException("when i is 6");
		}
	}
	public void xyz()throws ArithmeticException, IOException,UserException
	{
		abc();
	}
	public void atoz()throws ArithmeticException, IOException,UserException
	{
		xyz();
	}
}

public class ExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			A a1=new A();
			a1.atoz();
		}
		catch(IOException e)
		{
			System.out.println("Input Output Exception occurred...");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Exception occurred...");
		}
		catch(UserException e)
		{
			System.out.println("Custom Exception occurred...");
			System.out.println("reason:"+e.getMessage());
			e.printStackTrace();
			e.display();
		}
		catch(Exception e)
		{
			System.out.println("Default Exception Handler...");
		}
		finally
		{
			System.out.println("THANKS");
		}
		System.out.println("Program Continues...........");
	}
}

class UserException extends Exception
{
	public UserException()
	{
	}

	public UserException(String msg)
	{
		super(msg);
	}

	public void display()
	{
		System.out.println("Just for Demo");
	}

}