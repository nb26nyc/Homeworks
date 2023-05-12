package HW6;

import java.util.Scanner;

public class Task5Quiz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter quiz score");
        int quizScore=scanner.nextInt();
        System.out.println("Enter mid term score");
        int midTermScore=scanner.nextInt();
        System.out.println("Enter final score");
        int finalScore=scanner.nextInt();
        int averageScore=(quizScore+midTermScore+finalScore)/3;
        if (averageScore>=90){
            System.out.println("Grade=A");
        } else if (averageScore>=70&&averageScore<90) {
            System.out.println("Grade=B");
        }else if (averageScore>=50&&averageScore<70){
            System.out.println("Grade C");
        }else {
            System.out.println("Grade F");
        }
    }
}
