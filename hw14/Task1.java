package HW14;

public class Task1 {
    /*
Create a method that will say Hello in different language based on the
 country that will passed when method is executed.
 */
    void hello(String language) {
        switch (language) {
            case "English":
                System.out.println("Hello");
                break;
            case "Ukrainian":
                System.out.println("Pruvit");
                break;
            case "French":
                System.out.println("Bonjour");
                break;
            case "Russian":
                System.out.println("Privet");
                break;
            case "Japanese":
                System.out.println("Kon'nichiwa");
                break;
            default:
                System.out.println("Invalid input");

        }

    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.hello("English");

    }
}
