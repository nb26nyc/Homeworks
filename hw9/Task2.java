package HW9;

public class Task2 {
    public static void main(String[] args) {
        //Create an array of names and store all names of your group. Then print
        // your name from that array. (use 2 different ways of creating an array).

        String[] names = {"Mila", "John", "Mellisa", "Liza", "Shone", "Steve"};
        System.out.println(names[5]);

        String[] namesNew = new String[6];
        namesNew[0] = "Mila";
        namesNew[1] = "John";
        namesNew[2] = "Mellisa";
        namesNew[3] = "Liza";
        namesNew[4] = "Shone";
        namesNew[5] = "Steve";
        System.out.println(namesNew[5]);
    }
}
