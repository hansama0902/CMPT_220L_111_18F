package Lab11;

import java.util.Scanner;

public class CountCharacterRecursive {

    public static int count(char[] chars, char ch) {
        return count(chars, ch, 0);
    }

    public static int count(char[] chars, char ch, int high) {
        if(chars.length == high) {
            return 0;
        } else {
            return (ch == chars[high] ? 1 : 0) + count(chars, ch, high+1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        System.out.println(ch + " appears " + count(str.toCharArray(), ch) + " times");
    }

}
