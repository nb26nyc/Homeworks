package HW11;

public class Task2HW {
    public static void main(String[] args) {

             /*
        Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String animal="Dolphin";
        for (int i = animal.length()-1; i >=0 ; i--) {
            System.out.print(animal.charAt(i)+" ");
        }
    }
}
