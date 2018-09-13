package One;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   int n1,n2;
	   System.out.println("Enter first number");
	   n1 = sc.nextInt();
	   System.out.println("Enter second number");
	   n2 = sc.nextInt();
	   System.out.println(n1+" less than "+n2 +" "+(n1<n2));
	   System.out.println(n1+" less than equal "+n2 +" "+(n1<=n2));
	   System.out.println(n1+" equal to "+n2 +" "+(n1==n2));
	   System.out.println(n1+" not equal to "+n2 +" "+(n1!=n2));
	   System.out.println(n1+" greater than "+n2 +" "+(n1>n2));
	   System.out.println(n1+" greater than equal to "+n2 +" "+(n1>=n2));
	}
}
	




