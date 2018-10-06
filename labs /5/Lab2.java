package Lab5;
import java.util.Scanner;
public class Lab2 {



	public static double mean(double[] x) {

	double sum = 0, mean = 0, len = x.length;

	for (double n : x)

	sum += n;

	mean = sum / len;

	return mean;

	}

	public static double deviation(double x[]) {

	double sqDiff = 0, len = x.length;

	double mean = mean(x);

	for (int i = 0; i < len; i++)

	sqDiff += (x[i] - mean) * (x[i] - mean);

	return Math.sqrt(sqDiff / len);

	}

	public static void main(String[] args) {

	double arr[] = new double[10];

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter 10 Numbers.");

	for (int i = 0; i < 10; i++)

	arr[i] = scan.nextDouble();

	System.out.println("Mean : " + mean(arr));

	System.out.println("Standard Deviation: " + deviation(arr));

	}

	}


