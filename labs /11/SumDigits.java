package Lab11;

import java.util.Scanner;

public class SumDigits {

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = in.nextLong();
        System.out.println("Sum of all digits of " + n + " is " + sumDigits(n));
    }

}
