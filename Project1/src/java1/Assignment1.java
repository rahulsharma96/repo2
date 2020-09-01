package java1;

public class Assignment1 {

	int age;
	int roll_no;
	 public void display1()
	 {
		 System.out.println("Welcome to all of you");
	 }
	 
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Assignment1 deepak = new Assignment1();
		deepak.display1();
		deepak.display2();
		deepak.age=34;
		System.out.println("deepak age is "+deepak.age);
		deepak.roll_no=11;
		System.out.println("deepak roll no is" +deepak.roll_no);
	
	}
}

