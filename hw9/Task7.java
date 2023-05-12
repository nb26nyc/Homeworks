package HW9;

public class Task7 {
    public static void main(String[] args) {
        //       From an array of integer elements find the largest number.

        int[] numbers = {1, 20, 30, 4, 5, 6};
        int largestNumber = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println(largestNumber);

    }
}
