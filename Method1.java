import java.util.Scanner;
public class Method1 {

	public static void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println("The multiple of the provided number is"+"="+c);
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt()	;
	//object created 
Method1 m1=new Method1();
m1.multiply(a,b);

	}

}
