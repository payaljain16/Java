import java.io.*;
import java.util.*;

public class DeserializeDemo
{
	public static void main(String args[])
	{
		try
		{

			ObjectInputStream ois= new ObjectInputStream(new FileInputStream("emp.ser"));
			ArrayList obj=(ArrayList)ois.readObject();

			Iterator i=obj.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}