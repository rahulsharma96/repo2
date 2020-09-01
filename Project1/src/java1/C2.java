package java1;

public class C2 extends C1 {

	public C2() 
	{		
		System.out.println("child default");
		
	}
	public C2(int a) 
	{	
		System.out.println("child 1 parametrized");
		
	}
	public C2(int a, int b)
	{
		super(2,3);
		System.out.println("child 2 parametrized");
	}
	public C2(int a, int b,int c) 
	{
		System.out.println("child 3 parametrized");
		
	}
	public C2(int a, int b, int c, int d) 
	{		
		this();
		System.out.println("child 4 parametrized");
	}
	
	public static void main(String[] args) {
		C2 obj = new C2(4,3);
		
	}
}
