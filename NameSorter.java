package assignment;
import java.util.*;

public class NameSorter implements Comparator
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