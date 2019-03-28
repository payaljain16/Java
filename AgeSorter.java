package assignment;
import java.util.*;

public class AgeSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee p1=(Employee)obj1;
		Employee p2=(Employee)obj2;

		/*Integer a1=p1.age;
		Integer a2=p2.age;
		
		return a1.compareTo(a2);*/

		int flag=p1.age-p2.age;
		if(flag==0) flag=(p1.name).compareTo(p2.name);
		return flag;
	}
}

