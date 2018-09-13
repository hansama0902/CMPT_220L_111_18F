package Program3;
import java.util.*;

public class Program3 {
	
	   public static void main(String[] args) {

	    int n1,n2;
	    Scanner sc = new Scanner(System.in);

	   System.out.println("Enter Lower Limit Number");
	   n1 = sc.nextInt();
	   System.out.println("Enter Upper limit Number");
	   n2 = sc.nextInt();
	   for (int i = 0; i < 3; i++) {
	           System.out.println(getRand(n1, n2));
	   }
	   }

	   private static int getRand(int n1, int n2) {

	       if (n1 >= n2) {
	           throw new IllegalArgumentException("max must be greater than min");
	       }

	       Random r = new Random();
	       return r.nextInt((n2 - n1) + 1) + n1;
	   }
	}



