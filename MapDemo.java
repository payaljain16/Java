import java.util.*;

public class MapDemo
{
	public static void main(String args[])
	{
		HashMap obj=new HashMap();
		//TreeMap obj=new TreeMap();
		
		obj.put("111","Ramesh");
		obj.put("222","Rakesh");
		obj.put("333","Rajesh");
		obj.put("444","Samesh");
		obj.put("555","Pamesh");

		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}