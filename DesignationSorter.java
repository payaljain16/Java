package assignment;
import java.util.*;

public class DesignationSorter implements Comparator
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