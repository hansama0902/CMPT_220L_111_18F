package Lab5;

public class Lab7 {


	    public static boolean isUpperTriangular(double[][] array) {
	        for(int i = 0; i < array.length; ++i) {
	            for(int j = 0; j < array[i].length; ++j) {
	                if(i > j && array[i][j] != 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(isUpperTriangular(new double[][] {{2, 1, 4}, {0, 3, -1}, {0, 0, -2}}));
	        System.out.println(isUpperTriangular(new double[][] {{2, 1, 4}, {0, 3, -1}, {0, 1, -2}}));
	    }

	}


