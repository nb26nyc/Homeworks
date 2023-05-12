package HW9;

public class Task8 {
    public static void main(String[] args) {
        //Create an array to store char values and then print those in reverse order

        char [] values={'!','@','#','$','%','^'};
        for (int i= values.length-1;i>=0;i--){
            System.out.print(values[i]+" ");
        }
    }
}
