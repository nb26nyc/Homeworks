package HW12;

import java.util.Scanner;

public class Task3 {
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

        Scanner scanner=new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String momsName=scanner.next();
        System.out.println("Dad’s first name?");
        String dadsName=scanner.next();
        System.out.println("Boy or Girl?");
        String babyGender=scanner.next();

        if (babyGender.equals("boy")){
            System.out.println(dadsName.substring(0,3)+momsName.substring(momsName.length()-2));
        }else if (babyGender.equals("girl")){
            System.out.println(momsName.substring(0,3)+dadsName.substring(dadsName.length()-2));
        }else {
            System.out.println("invalid input");
        }

    }

}
