package Lab11;
import java.io.*;
import java.util.*;
public class CharacterCount {
static int k=0;
public static void main(String args[])
{
	try
	{
		System.out.print("Type a string to analyze: ");
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("Type a charActer to check;");
		String temp = input.nextLine(); 
		char c = temp.charAt(0);
		int count = count(str,c);
		System.out.println("There are" + count+" "+ c +" 's. ");
		

}
		catch (Exception e)
	{
			System.out.println("Exception has occurred in the class. program will exit.");
			System.exit(0);
	}
	}
public static int count (String str, char a) {
           return count(str,a,0);
}

public static int count(String str, char a,int high)
{
           if(str.equals(""))
           {
        	   return 0;
           }
           if(high + 1 <= str.length())
           {
        	   if(str.substring(high,high+1).
        			   equals(Character.toString(a)))
        	   {
        		   k++;
        	   
           }
           count(str.substring(high+1,str.length()),a,high);
}      
         return k;
         }
}