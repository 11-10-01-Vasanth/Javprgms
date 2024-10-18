package project;

//Singleton Factory

class Onecls
{
	private Onecls(){
		System.out.println("Hii");
	}
	private static Onecls obj;
	public static Onecls get()
	{
		if(obj==null)
		{
			obj = new Onecls();
		}
		return obj;
	}
}

public class OneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onecls o = Onecls.get();
		Onecls p = Onecls.get();
	}

}
