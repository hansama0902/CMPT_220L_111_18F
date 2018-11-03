package Lab8;
import java.util.ArrayList;

import java.util.Scanner;
class pro_3 {

public static void sort(ArrayList<Integer> list)

{

int n = list.size();

for (int i = 0; i < n-1; i++)

for (int j = 0; j < n-i-1; j++)

if (list.get(j) > list.get(j+1))

{

int temp = list.get(j);

list.set(j, list.get(j+1));

list.set(j+1, temp);

}

for(int i: list)

System.out.print(i + " ");

System.out.println();

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

ArrayList<Integer> al = new ArrayList<Integer>();

int input;

for(int i=0; i<5; i++)

{

System.out.print("Enter number" + (i+1) + ": ");

input = sc.nextInt();

al.add(input);

}

sort(al);

sc.close();

}

}




