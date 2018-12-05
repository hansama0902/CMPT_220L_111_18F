package Lab11;

import java.util.*;

class pro_2

{

public static int large(int list[],int size,int largest)

{

if (size == 0)

return largest;

if (size > 0)

{

if (list[size] > largest)

{

largest = list[size];

}

return large(list, size - 1, largest);

}

return largest;

}

public static void main (String[] args)

{

Scanner sc=new Scanner(System.in);

int []arr=new int[8];

System.out.println("enter eight integer numbers : ");

for(int i=0;i<8;i++)

arr[i]=sc.nextInt();

int max=large(arr,7,arr[0]);

System.out.println("largest number in the array is : "+max);

}

}