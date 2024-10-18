package project;

abstract class Person
{
	public abstract void name();
	public abstract void id();
	public abstract void dob();
}

class Student extends Person
{
	Student()
	{
		System.out.println("Constructor");
	}
	public void name()
	{
		System.out.println("Studentname");
	}
	public void id()
	{
		System.out.println("Studentid");
	}
	public void dob()
	{
		System.out.println("Studentdob");
	}
}

class Employee extends Person
{
	public void name()
	{
		System.out.println("Employeename");
	}
	public void id()
	{
		System.out.println("Employeeid");
	}
	public void dob()
	{
		System.out.println("Employeedob");
	}
}

public class Abstraction {

	public static void main(String[] args) 
	{
		Person s = new Employee();
		s.name();
	}

}
