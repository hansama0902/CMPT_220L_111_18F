package pro_2;
import java.util.Scanner;
public class pro_2 {



	     public static void main(String[] args) {

	         int n, i=1 ;

	         for(n=100; n<=500; n++) {


	               if( (n%5==0 && n%7!=0) || (n%5!=0 && n%7==0) ) {

	                      if(i<=10) {                                   

	                            System.out.print(n+" ");

	                            i++;

	                      }

	                      else {

	                          System.out.println();            

	                            i=1;       
	                        }

	                }

	         }

	}

	}


