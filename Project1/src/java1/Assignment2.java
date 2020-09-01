package java1;

public class Assignment2 {
	public int sum(int a,int b){
		int c;
		c=a+b;
		System.out.println("Sum of two no is"+c);
		return c;}
	public int sub(int a,int b){
		int x;
		x=a-b;
		System.out.println("Sub of two no is"+x);
		return x;}
	public int mul(int a,int b){
		int p;
		p=a*b;
		System.out.println("Multiplication is"+p);
		return p;   }	
	public int div(int a,int b){
		int q;
		q=a/b;
		System.out.println("final answer is"+q);
		return q;}
	
	public static void main(String[] args) {
		Assignment2 as= new Assignment2();
		 int sum_result= as.sum(10,2);
		 int sub_result= as.sub(sum_result,2);
		 int mul_result= as.mul(sub_result,2);
		 int sum_result1= as.sum(mul_result,2);
		 int div_result= as.div(sum_result1,2);
	}
	
	
}
