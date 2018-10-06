package Lab5;

	import java.util.Scanner;
	public class Lab4 {



		    public static boolean isUpperTriangular(double[][] array) {
		        for(int i=0; i<array.length; i++) {
		            for(int j=0; j<array[i].length; j++) {
		                if(i > j && array[i][j] != 0) {
		                    return false;
		                }
		            }
		        }
		        return true;
		    }

		    public static boolean equal(int x[], int y[]) {
		        if(x == null || y == null || x.length != y.length) {
		            return false;
		        }
		        for(int i=0; i<x.length; i++) {
		            if(x[i] != y[i]) {
		                return false;
		            }
		        }
		        return true;
		    }


		    public static void main(String args[]) {
		        double matrix[][] = {{2, 1, 4}, {0, 3, -1}, {0, 0, -2}};
		        System.out.println(isUpperTriangular(matrix));

		        Scanner in = new Scanner(System.in);

		        System.out.print("Enter the first array: ");
		        int n1 = in.nextInt();
		        int x[] = new int[n1];
		        for(int i=0; i<n1; i++) {
		            x[i] = in.nextInt();
		        }
		        System.out.print("Enter the second array: ");
		        int n2 = in.nextInt();
		        int y[] = new int[n1];
		        for(int i=0; i<n2; i++) {
		            y[i] = in.nextInt();
		        }

		        if(equal(x, y)) {
		            System.out.println("The two array are indentical.");
		        } else {
		            System.out.println("The two arrays are not identical.");
		        }
		        in.close();
		    }

		}


