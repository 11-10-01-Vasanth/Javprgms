package project.project;

class Vehicle
{
	Vehicle()
	{
		System.out.println("Vehicle");
	}
	public void start()
	{
		System.out.println("Vehicle start");
	}
	public void stop()
	{
		System.out.println("vehicle stop");
	}
}

class Car extends Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Car start");
	}
}

class Bus extends Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Bus start");
	}
}


public class PolyMorphism {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Vehicle v = new Car();
		v.start();
		v.stop();
		Vehicle v1 = new Bus();
		v1.start();
		v1.stop();
	}

}
