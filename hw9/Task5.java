package HW9;

public class Task5 {
    public static void main(String[] args) {
        /*
Create an array of animals and store 5 elements into it. Using 2 different loops print
all elements from the array.
    */

        String[] animals = {"dog", "horse", "bird", "deer", "lion"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + " ");
        }
        System.out.println();

        for (String newLoopAnimals : animals) {
            System.out.println(newLoopAnimals + " ");
        }
    }
}
