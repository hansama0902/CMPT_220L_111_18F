package pro_6;


	import java.util.Scanner;

	public class pro_6 {

	    public static int vowelCount(String s) {
	        s = s.toLowerCase();
	        int count = 0;
	        char ch;
	        for(int i = 0; i < s.length(); ++i) {
	            ch = s.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                ++count;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = in.nextLine();
	        System.out.println("Number of vowels in '" + str + "' is " + vowelCount(str));
	    }

	}


