package Lab5;
import java.util.Scanner;
public class Lab1 {


	    public static double max(double array[]) {
	        double maxValue = array[0];
	        for(int i = 1; i < array.length; ++i) {
	            if(array[i] > maxValue) {
	                maxValue = array[i];
	            }
	        }
	        return maxValue;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter 10 numbers: ");
	        double arr[] = new double[10];
	        for(int i = 0; i < arr.length; ++i) {
	            arr[i] = in.nextDouble();
	        }
	        System.out.println("Maximum value in array is " + max(arr));
	    }
}
	


