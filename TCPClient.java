import java.io.*;
import java.net.*;

public class TCPClient
{
	public static void main(String args[])
	{
		try
		{

			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));			

			InetAddress ia=InetAddress.getLocalHost();  //since running on current system

			Socket cs=new Socket(ia,95);

			PrintWriter out = new PrintWriter(cs.getOutputStream());
			
			String line=null;
			System.out.println("Enter data to be sent : ");
			do
			{
				line=br.readLine();
				out.println(line);
				out.flush();
			}while(!line.equals("end"));
	
			out.close();
			br.close();
			cs.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}