package HW6;

import java.util.Scanner;

public class Task3Time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input current time in 24 format");
        int hour=scanner.nextInt();
        if (hour>=1&&hour<=11){
            System.out.println("Morning");
        } else if (hour>=12&&hour<=15) {
            System.out.println("Afternoon");
        } else if (hour>=16&&hour<=20) {
            System.out.println("Evening");
        }else if (hour>=21&&hour<=24){
            System.out.println("Night");
        }else{
            System.out.println("Invalid time");
        }
    }
}
