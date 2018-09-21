package pro_5;

	import java.util.Scanner;

	public class pro_5 {

	public static double average(double a, double b, double c){

	double sum = a + b + c; 

	double average = sum / 3; 

	return average; 

	}

	public static int countVowel(String s){

	int count = 0; 

	for (int i = 0; i < s.length() ; i++ ) {

	char c = s.charAt(i); 

	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||

	c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){ 

	count += 1; 

	}

	}

	return count;

	}

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	System.out.print("Enter a : ");

	double a = in.nextDouble();

	System.out.print("Enter b : ");

	double b = in.nextDouble();

	System.out.print("Enter c : ");

	double c = in.nextDouble();

	System.out.println("Average is : "+average(a,b,c)); 

	System.out.print("Enter a string : ");

	String s = in.next();

	System.out.println("Vowel Count : "+countVowel(s)); 

	}

	}



