package project;

class Square
{
	private static int side;
	public void setSide(int side)
	{
		this.side = side;
	}
	public static int getSide()
	{
		return side;
	}
	public int area()
	{
		return side*side;
	}
}

class Cube 
{
	private Square square;
	public void setCube(Square square)
	{
		this.square = square; 
	}
	public Square getCube()
	{
		return square;
	}
	public int cubeArea() 
	{
		int a = square.getSide();
		return a*a*a;
	}
}

public class Singleton {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Square s = new Square();
		s.setSide(5);
		Cube c = new Cube();
		System.out.println(c.cubeArea());
		System.out.println(s.area());
	}

}
