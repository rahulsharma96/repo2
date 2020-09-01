package java1;

public class Class4 extends Class3
{
	public void display1()
	{
		System.out.println("I am child method");
	}
	public static void main(String[] args) {
		Class4 cs = new Class4();
		cs.method1();
		cs.method2();
		cs.a=34;
		cs.display1();
		System.out.println(cs.a);
	}
}
