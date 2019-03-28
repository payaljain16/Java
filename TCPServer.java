import java.io.*;
import java.net.*;

public class TCPServer
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(95);
			System.out.println("Server started...");
			Socket cs = ss.accept(); //accept client request and store which client
			System.out.println("Connected to : "+cs);

				String line=null;
			BufferedReader br= new BufferedReader(new InputStreamReader(cs.getInputStream()));	
		

			do
			{
				line=br.readLine();
				System.out.println(line);
				
			}while(!line.equals("end"));
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}