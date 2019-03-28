public class MyApp
{
	public static void main(String args[])
	{
		try
		{
			Runtime rt=Runtime.getRuntime();
			
			System.out.println("wait and see  magic");
			Thread.sleep(5000);
			Process p1=rt.exec("explorer.exe");
			Thread.sleep(5000);
			Process p2=rt.exec("calc.exe");
			Thread.sleep(5000);
			Process p3=rt.exec("mspaint.exe");

			Thread.sleep(5000);
			Process p4=rt.exec("notepad.exe");
			Thread.sleep(10000);
			p4.destroy();
			Thread.sleep(5000);
			p3.destroy();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}