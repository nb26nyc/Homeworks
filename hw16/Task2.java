package HW16;

public class Task2 {
        /*
    Create a method that will accept a String as a parameter and return a new
    String that consist only of vowels. Method should be available inside the
     class only where it was declared and executed by calling it is name
     */

    private String vowels(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        System.out.println(obj.vowels("Today is Friday"));
    }
}
