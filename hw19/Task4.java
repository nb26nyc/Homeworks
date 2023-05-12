package HW19;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
     */

    private void method1(int a, int b, double c){
        System.out.println(a+b+c);
    }
    private void method1(int b, double c, int a){
        System.out.println(a-b+c);

    }
    private void method1(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        Task4 obj1=new Task4();
        obj1.method1(1,6,1.2);
        obj1.method1(5,3.3,9);
        obj1.method1(15,25);
    }
}
