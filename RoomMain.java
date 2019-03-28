class Room
{
	int length;
	int width;
	Room()
	{
		length=10;
		width=20;
	}

	Room(int length,int width)
	{
		this.length=length;
		this.width=width;
		this.area();
	}

	void area()
	{
		System.out.println(length*width);
	}
}

public class RoomMain
{	
	public static void main(String args[])
	{
		Room r1=new Room();
		Room r2=new Room(30,40);
		r1.area();
		r2.area();

		System.out.println("--------------");
		r1.length=50;
		r2.width=60;
		r1.area();
		r2.area();

		System.out.println("--------------");
		r2=r1;
		r1.length=70;
		r2.width=80;
		r1.area();
		r2.area();
	}
}