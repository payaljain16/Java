class A implements Cloneable
{
	int x;
	public String toString()
	{
		return "The object with value of x:"+x;
	}
	
	public A clone()
	{
		try
		{	
			return (A)super.clone();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public void finalize()
	{
		System.out.println("Object with value of x: "+x+"is getting removed.....");
	} 
}

public class ObjectDemo
{
	public static void main(String args[])throws Exception
	{
		A a1=new A();
		A a2=new A();
		a1.x=10;
		a2.x=50;
		System.out.println(a1.equals(a2));
		
		A a3=a1.clone();

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());

		//Class c1=a2.getClass();
		Class c1="Demo".getClass();
		System.out.println("Class NAme:"+ c1.getName());

		a3.x=100;
		a1=null;
		a2=null;
		a3=null;

		System.gc();
		Thread.sleep(2000);
	}
}