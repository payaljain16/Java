import java.util.*;

public class SortingDemo
{
	public static void main(String args[])
	{
		TreeSet obj=new TreeSet(new NameSorterRev());
		obj.add(new Person("Payal",22));
		obj.add(new Person("Payal1",20));
		obj.add(new Person("Payal2",24));
		obj.add(new Person("Akash",26));
		obj.add(new Person("Payal4",28));

		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("-------------------------");

		List list=new LinkedList();

		list.add(new Person("Abhilash",32));
		list.add(new Person("Zebra",38));
		list.add(new Person("Girish",31));

		//Collections.reverse(list);
		Collections.sort(list,new AgeSorter());

		Iterator i1=list.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}