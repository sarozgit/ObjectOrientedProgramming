import java.util.Scanner;
public class Table {
	
	public static void table(int n)
	{
		
		for(int i=1;i<=10;i++)
		{
			int c=i*n;
			System.out.println(n +"*" +i +"="+ +c );
	
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter Number to print Table");
int n=sc.nextInt()	;
Table t=new Table();
t.table(n);
	}

}
