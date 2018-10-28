package Lab7;

// JA: You had to use the StackOfIntegers class

import java.util.Scanner;

import java.util.Stack;

public class pro_2 {

public static void main(String[] args) {

int numbers;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the positive integer : ");

numbers = sc.nextInt();

Stack<Integer> myStack = new Stack<>();

int checker=2;

while(numbers!=1){

while(numbers%checker==0){

myStack.push(checker);

numbers = numbers/checker;

}

checker++;

}

System.out.print("The smallest factors are : ");

while(!myStack.isEmpty()){

System.out.print(myStack.pop()+" ");

}

}

}

