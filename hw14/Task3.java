package HW14;

public class Task3 {
    // Write a method to return whether given number is prime or not?

    boolean isPrime(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number != i) {
                prime = false;
                break;
            } else if (i == number) {
                prime = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        Task3 obj = new Task3();
        System.out.println(obj.isPrime(6));
    }

}
