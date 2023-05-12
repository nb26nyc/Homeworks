package HW9;

public class Task6 {
    public static void main(String[] args) {
        //Create an array on integers and calculate the sum of all elements in an array

        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            sum += i;
            sum++;
        }
        System.out.println(sum);
    }
}
