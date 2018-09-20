package Energy;

import java.util.Scanner;

public class Energy {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter mass: ");

    double m = sc.nextDouble();
    double c =  299972458.0;

    double energy = m * c * c;

    System.out.println("Energy : " + energy);
  }
}
