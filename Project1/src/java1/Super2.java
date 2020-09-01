package java1;

public class Super2 extends Super1 {
	
	public void method2() {
		super.a=34;   //parent variable call
		super.method1(); //parent method call
		System.out.println("I am method 2");
		
	}
public static void main(String[] args) {
	Super2 obj = new Super2();
	obj.method2();

}
}
