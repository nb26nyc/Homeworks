package HW2;

public class Variables {
    public static void main(String[] args) {
        String firstName="Natalia";
        String lastName="Pavlyuk";
        char grade='A';
        String city="NYC";
        String state="New York";
        String phoneNumber="+16463352154";

        System.out.println("My first name is " +firstName+ " and my last name is "  +lastName );
        System.out.println("I am " +grade+ " student");
        System.out.println("I live in " +city+ " " +state);
        System.out.println("My phone number is " +phoneNumber);

        city="Miami";
        state="Florida";
        phoneNumber="+17184863214";

        System.out.println("My first name is " +firstName+ " and my last name is "  +lastName+ " And i moved to " +city+ " " +state+ ". My new phone number is " +phoneNumber );
    }

}
