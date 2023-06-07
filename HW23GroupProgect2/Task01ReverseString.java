package HW23GroupProgect2;


import java.util.Scanner;

/*
Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
*/
public class Task01ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your input is expected on the next line:");
        String input = scan.nextLine();
        String output = reverseString(input);
        System.out.println(output);
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}