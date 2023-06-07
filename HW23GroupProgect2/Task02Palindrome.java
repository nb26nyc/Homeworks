package HW23GroupProgect2;

import java.util.Scanner;

/*
Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example: "madam", "civic", "radar", "level", "racer" are the palindromes.
*/
public class Task02Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your input is expected on the next line:");
        String input = scan.nextLine();
        boolean output = isPalindrome(input);
        System.out.println(output);
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}