package pro_2;

public class pro_2 {
	  public static void main(String[] args)

	  {

	        double pi1 = 0.0;

	       

	        int i;


	        for( i = 1 ; i <= 11 ; i += 2 )

	        {


	            double curr = 1.0 / (double)i;

	            


	            if( i % 2 == 0 )

	                pi1 -= curr;


	            else

	                pi1 += curr;

	        }

	       

	        pi1 *= 4;

	       

	        System.out.println("pi upto 11 : " + pi1);

	       

	       

	        double pi2 = 0.0;

	       

	        for( i = 1 ; i <= 13 ; i += 2 )

	        {


	            double curr = 1.0 / (double)i;

	           

	            if( i % 2 == 0 )

	                pi2 -= curr;


	            else

	                pi2 += curr;

	        }

	       

	        pi2 *= 4;


	        System.out.println("pi upto 13 : " + pi2);

	    }
}
