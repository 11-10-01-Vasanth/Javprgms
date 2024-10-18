package project;

interface Heli
{
	public void start();
}

class Hcar implements Heli
{
	public void start()
	{
		System.out.println("Hello");
	}
}


public class Interface 
{

	public static void main(String[] args) 
	{
		Hcar h = new Hcar();
		h.start();
	}

}
