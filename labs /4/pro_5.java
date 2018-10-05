package pro_1;
import java.util.Scanner;
import java.util.Random;
public class pro_5 {

	
	    // JA: You had to calculate the average and the number of values larger and lower than the average
	    public static void main(String[] input)
	    {
	        int len, i, randnum;
	        Random rn = new Random();
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("How Many Random Numbers You want to Generate ? ");
	        len = scan.nextInt();
	        
	        System.out.print("\nGenerating " + len + " Random Numbers in the range 0...999 \n");
	        for(i=0; i<len; i++)
	        {
	            randnum = rn.nextInt(1000);
	            System.out.print(randnum + "   ");
	        }
	    }
	}

