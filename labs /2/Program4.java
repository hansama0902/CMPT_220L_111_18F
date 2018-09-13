package Program4;
import java.util.Scanner;
public class Program4 {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
int first, second;
System.out.print("Enter first character: ");
first = keyboard.next().charAt(0); 
System.out.print("Enter second character: ");
second = keyboard.next().charAt(0);
int res = first + second;
System.out.println("Result is: " + res );
}
}
