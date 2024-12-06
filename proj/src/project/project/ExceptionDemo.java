package project.project;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 0;
		try
		{
			int c = a/b;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("End...");
		
	}

}
