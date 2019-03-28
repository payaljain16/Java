import java.util.*;

class NameSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Person p1=(Person)obj1;
		Person p2=(Person)obj2;

		String n1=p1.name;
		String n2=p2.name;
		
		return n1.compareTo(n2);
	}
}

class NameSorterRev implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Person p1=(Person)obj1;
		Person p2=(Person)obj2;

		String n1=p1.name;
		String n2=p2.name;
		
		return n2.compareTo(n1);
	}
}

class AgeSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Person p1=(Person)obj1;
		Person p2=(Person)obj2;

		Integer a1=p1.age;
		Integer a2=p2.age;
		
		return a1.compareTo(a2);
	}
}