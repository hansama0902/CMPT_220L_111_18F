package pro_1;
	import java.util.Scanner;


	public class pro_1 {

	     public static void main(String[] args) {

	       int intNum, totSum=0, noEven=0, totNo=0 ;

	       double average=0.0;

	       

	       Scanner scan = new Scanner(System.in);

	       

	       System.out.println("Enter a positive integer, the input ends with a 0: ");

	        do {

	             

	               intNum = scan.nextInt();      

	               if(intNum==0)                     

	                       break;                        

	              

	                if(intNum%2 == 0)          
	                             noEven++;         

	                totSum =totSum + intNum;          

	                totNo++;                                      

	              }while(true);

	              average = (float)totSum/(float)totNo;    

	             //Printing the results

	             System.out.println("The number of even numbers: "+noEven);

	             System.out.println("The total sum: "+totSum);

	             System.out.println("The average is : "+String.format ("%.2f", average));        

	}

	}

