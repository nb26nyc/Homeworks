package HW23GroupProgect2;

import java.util.Scanner;

    /*
    Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.
    */

public class Task05FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String is expected on the next line:");
        String input = scan.nextLine();
        Character output = firstNonRepeatingCharacter(input);
        System.out.println(output);
    }

    public static Character firstNonRepeatingCharacter(String s) {
        int[] charCounts = new int[50];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }
}
