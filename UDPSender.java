import java.io.*;
import java.net.*;

public class UDPSender
{
	public static void main(String args[])
	{
		try
		{
			byte[] data=new byte[1024];  //data is sent in byte stream
			InetAddress ia = InetAddress.getLocalHost();  //connect to own system
			//InetAddress ia = InetAddress.getByName("10.249.34.250");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			DatagramSocket ds = new DatagramSocket(1095);
			DatagramPacket dp = null;
	
			System.out.println("Enter data to be sent :- ");
			String line=null;
			do
			{
				line=br.readLine();
				data= line.getBytes(); //return byte array
				dp=new DatagramPacket(data,data.length,ia,1096);
				ds.send(dp);
				dp=new DatagramPacket(data,data.length,ia,1097);
				ds.send(dp);
				dp=new DatagramPacket(data,data.length,ia,1098);
				ds.send(dp);

			}while(!line.equals("quit"));

			ds.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}