public class Person
{
	String name;
	int age;

	public Person(String n, int a)
	{
		name=n;
		age=a;
	}
	
	public String toString()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		return "";
	}
}