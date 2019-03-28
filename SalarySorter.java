package assignment;
import java.util.*;

public class SalarySorter implements Comparator
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
