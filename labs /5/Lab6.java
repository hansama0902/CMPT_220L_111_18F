package Lab5;

import java.util.Scanner;

public class Lab6 {

	public static double max(double[] array) {
		double maximum = array[0];
		for (int i = 0; i < array.length; i++)
			if (array[i] > maximum)
				maximum = array[i];
		return maximum;
	}

	public static double averageRow(double[][] array, int columnIndex){

		double sum = 0;
		// print the 2D array
		System.out.println("The Array is:------>");
		for(int i=0;i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(array[i][j] + "\t\t");
			}
			System.out.println();
		}

		for(int i = 0; i < array.length; i++){
			sum += array[i][columnIndex];
		}
		return (sum / array.length);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 floating point numbers: ");
		double array[] = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Maximum element in the array is: " + max(array));

		// Here I am considering 5*5 2D array

		double[][] twoDimArray = {{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25},
		};

		System.out.println("Average of 4th column values is: " + averageRow(twoDimArray, 3)); // here 3 means 4th column
	}

}
