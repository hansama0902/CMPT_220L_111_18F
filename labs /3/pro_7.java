package pro_7;

	import java.util.Scanner;

	public class pro_7 {
	  public static int getPentagonalNumber(int n){
	    return ((3*n*n)-n)/2;
	  }

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n;
	    System.out.print("Enter n: ");
	    n = scanner.nextInt();
	    for(int i = 0;i<n;i++){
	      System.out.println(getPentagonalNumber(i));
	    }
	  }
	}

