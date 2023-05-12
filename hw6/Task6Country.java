package HW6;

import java.util.Scanner;

public class Task6Country {
    public static void main(String[] args) {
        /*Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your country");
        String country=scanner.next();

        switch (country){
            case "United States Of America" :
                System.out.println("You speak english language");
                break;
            case "Canada":
                break;
            case "Spain":
                System.out.println("You speak spanish language");
                break;
            case "Brazil":
                System.out.println("You speak portuguese language");
                break;
            case "Germany":
                System.out.println("You speak german language");
                break;
            default:
                System.out.println();
        }


    }
}
