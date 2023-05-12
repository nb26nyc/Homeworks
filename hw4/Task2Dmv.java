package HW4;

import java.util.Scanner;

public class Task2Dmv {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("Drivers licence will be issued");
        }else{
            System.out.println("Learners permit will be issued");
        }

    }
}
