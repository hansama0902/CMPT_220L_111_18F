package pro_1;
import java.util.*;
public class pro_3 {

	public static void main(String args[])
	{
	System.out.print("Enter a String = ");

	Scanner read = new Scanner(System.in);
	String S = read.nextLine();
	if( isPalindrome(S) )
	{
	System.out.println("The String is Palindrome.");
	}
	else
	{
	System.out.println("The String is not Palindrome.");
	}
	}
	public static String reverse(String S)
	{
	String temp = "";
	for(int i=S.length()-1 ; i>=0 ;i--)
	{
	temp = temp + S.charAt(i);
	}
	return temp;
	}
	public static boolean isPalindrome(String S)
	{
	int flag = 1;
	String S_reversed = reverse(S);
	// JA: You can compared the complete word using equals()
	for(int i=0 ; i<S.length(); i++)
	{
	if(S.charAt(i) != S_reversed.charAt(i))
	{
	flag = 0;
	break;
	}
	}
	if(flag==0)
	{
	return false;
	}
	else
	{
	return true;
	}
	}
	

}
