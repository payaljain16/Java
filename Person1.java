public class Person1 implements java.io.Serializable
{
	String name;
	int age;

	public Person1()
	{
	}

	public Person1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public String toString()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		return "";
	}
}