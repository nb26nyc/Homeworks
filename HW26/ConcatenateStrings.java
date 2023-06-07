package HW26;

import java.util.LinkedHashSet;
import java.util.Set;

/*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
    */

public class ConcatenateStrings {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("starts");
        set.add("making");
        set.add("more");
        set.add("sense");
        set.add("now");

        String sentence = String.join(" ", set);
        System.out.println(sentence);

        System.out.println("**********************************");
        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
