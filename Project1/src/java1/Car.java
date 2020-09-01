package java1;

public class Car {

	public Car()
	{
		System.out.println("I am parent default");
	}
	public Car(int a)
	{
		this();
		System.out.println("I am parent one parametrized");
	}
	public Car(int a, int b)
	{
		this(4);
		System.out.println("I am parent two parametrized");
	}






}
