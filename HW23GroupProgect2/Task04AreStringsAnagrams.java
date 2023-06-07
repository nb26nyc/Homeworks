package HW23GroupProgect2;

import java.util.Arrays;
import java.util.Scanner;

    /*
    Check if Two Strings are Anagrams: Given two strings, determine if
    they are anagrams, meaning they contain the same characters in a
    different order. For example, "listen" and "silent" are anagrams.
     */

public class Task04AreStringsAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input of two strings are expected on next lines:");
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        boolean output = areAnagrams(input1, input2);
        System.out.println(output);
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }
}
