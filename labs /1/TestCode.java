package TestCode;
import java.util.Scanner;

public class TestCode
{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a value for ounces: ");
    double n = scanner.nextDouble();
    System.out.println(n + " ounces is " + (28.3495 * n));
  }
}