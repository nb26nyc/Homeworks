package HW19;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void m1 (int a, int b, double c){
        System.out.println(a+b+c);
    }
    static void m1(int a, int b){
        System.out.println(a+b);
    }
    static void m1(int a,double c, int b){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        m1(5,10,10.5);
        m1(15,20);
        m1(30,35,20.5);
    }
}

