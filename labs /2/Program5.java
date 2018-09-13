package Program5;
import java.util.*;

public class Program5 {
	  public static int lexiographicCompare(String x , String y)

	    {

	        if( x.equals(y) )

	            return 0;

	           

	        int a = 0, b;

	       

	        while( a < x.length() && a < x.length() )

	        {

	            if( x.charAt(a) != y.charAt(a) )

	            {


	                if( x.charAt(a) > y.charAt(a) )

	                    return 1;

	                else

	                    return -1;

	            }

	           

	            a++;

	        }

	      

	        if( x.length() > y.length() )

	            return 1;


	        else

	            return -1;

	    }

	   

	    public static void main(String[] args)

	    {

	        Scanner sc = new Scanner(System.in);

	       

	        System.out.print("Enter first string : ");

	        String str1 = sc.next();

	       

	        System.out.print("Enter second string : ");

	        String str2 = sc.next();

	       

	        // if x is smaller

	        if( lexiographicCompare( str1 , str2 ) < 0 )

	            System.out.println(str2 + " , " + str1);

	        // if x is greater

	        else if( lexiographicCompare( str1 , str2 ) > 0 )

	            System.out.println(str1 + " , " + str2);

	        else

	            System.out.println("Both are same");

	    }

}
