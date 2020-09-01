package java1;

public class T2 {

	public void method()
	{
		System.out.println("child default");
	}

	public void method(int a)
	{
		System.out.println("child 1 parametrized");
	}
	public void method(int a,int b)
	{
		System.out.println("child 2 parametrized");
	}
	public void method1(int a, int b, int c)
	{
		System.out.println("child 3 parametrized");
	}
	public void method1(int a, int b, int c, int d)
	{
		System.out.println("child 4 parametrized");
	}
	
	public static void main(String[] args) {
		T2 obj = new T2();
		obj.method(2,3);
	}



}
