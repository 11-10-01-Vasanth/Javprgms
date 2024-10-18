package project;

enum Name
{
	VASANTH,
	VIJAY,
	PONRAJ,
	GOODWIN
}

class Attendance
{
	public String getAttendance(Name n)
	{
		switch(n)
		{
			case VASANTH:
				return "Hi Vasanth";
			case VIJAY:
				return "Hi Vijay";
			case PONRAJ:
				return "Hi Ponraj";
			case GOODWIN:
				return "Hi Goodwin";
		}
		return "";
	}
}

public class Enum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Attendance a = new Attendance();
		System.out.println(a.getAttendance(Name.VASANTH));
	}

}
