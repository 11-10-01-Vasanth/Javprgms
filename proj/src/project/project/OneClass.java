package project.project;

//Singleton Factory

class Onecls
{
	public Onecls(){
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
		System.out.println(o);
	}

}
