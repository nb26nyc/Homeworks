package HW23GroupProgect2;

import java.util.Scanner;

    /*
    Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.
    */

public class Task03NumberOfWordsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your input is expected on the next line:");
        String input = scan.nextLine();
        int output = countWords(input);
        System.out.println(output);
    }

    public static int countWords(String s) {
        String[] words = s.split("\\s+");
        return words.length;
    }
}

