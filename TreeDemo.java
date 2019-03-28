import java.util.*;
public class TreeDemo
{
	public static void main(String args[])
	{
		TreeSet<Person> obj=new TreeSet<Person>();
		obj.add(new Person("Payal",22));
		obj.add(new Person("Payal1",20));
		obj.add(new Person("Payal2",24));
		obj.add(new Person("Payal3",26));
		obj.add(new Person("Payal4",28));

		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}