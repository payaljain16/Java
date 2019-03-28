import java.io.*;
import java.util.*;

public class SerializeDemo
{
	public static void main(String args[])
	{
		try
		{
			//Person1 p1 =new Person1();
			//p1.name="Ravi";
			//p1.age=25;

			ArrayList obj=new ArrayList();

			obj.add(new Person1("ram",25));
			obj.add(new Person1("qam",26));	
			obj.add(new Person1("sam",27));
			obj.add(new Person1("pam",28));
			obj.add(new Person1("gam",29));

			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("emp.ser")); //actual code
			oos.writeObject(obj);

			System.out.println("Successfully serialized....");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}