package HW4;

import java.util.Scanner;

public class Task1Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name");
        String city = scanner.nextLine();
        System.out.println("Enter temperature in fahrenheit");

        double temperature = scanner.nextDouble();
        double celsius = ((5 * (temperature - 32.0)) / 9.0);
        System.out.println(" The temperature in " + city + " is " + celsius + " C");

    }
}
