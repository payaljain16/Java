public class LangDemo
{
	public static void main(String args[])
	{
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(25));
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.floor(3.9));
		System.out.println(Math.round(3.5));
		int random=(int)(Math.random()*100);
		System.out.println(random);
		System.out.println("-----------------------------");

		int a=100;
		Integer i=new Integer(a);
		System.out.println(i.toBinaryString(a));
	}
}