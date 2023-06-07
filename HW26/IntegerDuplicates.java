package HW26;
import java.util.ArrayList;
import java.util.List;

/*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
    */
public class IntegerDuplicates {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(9);
        int sum = 0;
        for (var i : list) {
            sum += i;
        }
        System.out.println("Sum is:" + sum);
    }
}
