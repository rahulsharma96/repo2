package java1;

public class Maruti extends Car {

	public Maruti()
	{
		System.out.println("I am child default");
	}
	public Maruti(int a)
	{
		System.out.println("I am child one parametrized");
	}
	public Maruti(int a, int b)
	{
		super(2,2);
		System.out.println("I am child two parametrized");
	}
	
	public static void main(String[] args) {
		Maruti m = new Maruti(34,2);
		
	}
	
	
	
	
	
	
	
}
