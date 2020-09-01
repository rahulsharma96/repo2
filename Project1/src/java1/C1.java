package java1;

public class C1 {

	public C1()
	{
		this(3,4,5,6);
		System.out.println("Parent default");
	}
	public C1(int a)
	{
		this();
		System.out.println("Parent 1 parametrized");
	}
	public C1(int a, int b)
	{
		this(2,3,4);
		System.out.println("Parent 2 parametrized");
	}
	public C1(int a, int b, int c)
	{
		this(1);
		System.out.println("Parent 3 parametrized");
	}
	public C1(int a, int b, int c, int d)
	{
	
		System.out.println("Parent 4 parametrized");
	}
}
