package HW19;

public class Task1 {
    public static void calculateArea (int a, int b){
        int resultRectangle=a*b;
        System.out.println(resultRectangle);

    }
    public static void calculateArea (int a){
        int resultSquare=a*a;
        System.out.println(resultSquare);
    }
    class Task1Tester{
        public  static void main(String[] args){

            Task1.calculateArea(5,10);
            Task1.calculateArea(5);
        }
    }
}
