import java.util.Scanner;
public class KeyInput
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter name:");
		String name=sc.nextLine();

		System.out.print("Enter age:");
		int age=sc.nextInt();

		System.out.print("NAme is:"+name);
		System.out.print("age is:"+age);

	}
}