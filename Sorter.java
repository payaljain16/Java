package assignment;
import java.util.*;

class NameSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee p1=(Employee)obj1;
		Employee p2=(Employee)obj2;

		String n1=p1.name;
		String n2=p2.name;
		
		return n1.compareTo(n2);
	}
}


class AgeSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee p1=(Employee)obj1;
		Employee p2=(Employee)obj2;

		Integer a1=p1.age;
		Integer a2=p2.age;
		
		return a1.compareTo(a2);
	}
}

class SalarySorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee p1=(Employee)obj1;
		Employee p2=(Employee)obj2;

		Integer a1=p1.salary;
		Integer a2=p2.salary;
		
		return a1.compareTo(a2);
	}
}

class DesignationSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee p1=(Employee)obj1;
		Employee p2=(Employee)obj2;

		String n1=p1.designation;
		String n2=p2.designation;
		
		return n1.compareTo(n2);
	}
}