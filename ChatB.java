import java.io.*;
import java.net.*;

class UDPSender2 extends Thread
{
	public void run()
	{
		try
		{
			byte[] data=new byte[1024];  //data is sent in byte stream
			InetAddress ia = InetAddress.getLocalHost();  //connect to own system
			//InetAddress ia = InetAddress.getByName("10.249.34.250");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			DatagramSocket ds = new DatagramSocket(1097);
			DatagramPacket dp = null;
	
			System.out.println("Enter name :- ");
			String name=br.readLine();
			String line=null;
			do
			{
				line=br.readLine();
				line=name+" : " +line;
				data= line.getBytes(); //return byte array
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

class UDPReceiver1 extends Thread
{
	public void run()
	{
		try
		{
			byte data[]=new byte[1024];

			DatagramSocket ds = new DatagramSocket(1096);
			DatagramPacket dp=new DatagramPacket(data,data.length);

			String line=null;
			do
			{
				ds.receive(dp);
				line=new String(dp.getData(),0,dp.getLength());
				System.out.println(line);				

			}while(!line.equals("quit"));

			ds.close();
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class ChatB
{
	public static void main(String args[])
	{
		UDPSender2 s2=new UDPSender2();
		UDPReceiver1 r1=new UDPReceiver1();
		s2.start();
		r1.start();
	}
}