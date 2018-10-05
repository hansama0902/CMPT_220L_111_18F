package pro_1;

public class pro_6 {


		public static void main(String[] args) {

		// The end of the list is represented by the value -1

		int a[]={-1}; // JA: You should use int[] a = {-1} instead

		// Insert numbers 1 through 10 (in that order) into the array

		for(int i=1;i<=10;i++){

		a=addInt(a,i);

		}

		// printing the values in the array

		System.out.println("Contents of the array ");

		for(int i:a) System.out.print(i+" ");

		System.out.println();

		// insert 10 in position 3

		a=insert(a,10,3);

		System.out.println("\nafter insertion of 10 at position 3");

		for(int i:a) System.out.print(i+" ");

		System.out.println();

		// 100 in position 7

		a=insert(a,100,7);

		System.out.println("\nafter insertion of 100 at position 7");

		for(int i:a) System.out.print(i+" ");

		System.out.println();

		}

		// to add a number in a specific position in the list

		private static int[] insert(int a[],int i, int j) {

		a[j]=i;

		return a;

		}

		// to add a number at the end of the list

		private static int[] addInt(int[] a, int n) {

		int b[]=new int[a.length+1];

		for(int i=0;i<a.length-1;i++){

		b[i]=a[i];

		}

		b[b.length-2]=n;

		b[b.length-1]=-1;

		return b;

		}

		}



