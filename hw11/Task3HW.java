package HW11;

import java.util.Scanner;

public class Task3HW {
    public static void main(String[] args) {

          /*
        Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter wife's first name");
        String wife= scan.nextLine();
        System.out.println("Please enter husband's first name");
        String husband= scan.nextLine();
        System.out.println("boy or girl");
        String gender= scan.nextLine();
        String babyName;
        if(gender.equalsIgnoreCase("boy")){
            babyName=(husband.substring(0,3)+wife.substring(wife.length()-2));
            System.out.println("Suggested baby name for boy:"+babyName);
        }else if (gender.equalsIgnoreCase("girl")){
            babyName=(wife.substring(0,2)+husband.substring(husband.length()-3));
            System.out.println("Suggested baby name for girl:"+babyName);
        }else{
            System.out.println("Error:Please enter boy or girl");
        }
    }
}
