package project1;

import java.util.Random;

import java.util.Scanner;

public class project1 {

public static void main(String[] args) {

Scanner cin = new Scanner(System.in);

Random rand = new Random();

int size = 100;

int[] array = new int[size];

for (int i = 0; i < size; i++) {

array[i] = rand.nextInt(100);

}

System.out.print("Enter index value between 0 - " + (size - 1) + " : ");

int index = cin.nextInt();

if (index < 0 || index > size - 1) {

System.out.println("Out of Bounds");

} else {

System.out.println("The value in the index is : " + array[index]);

}

}

}


