package HW28;

/*
Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is less than 5 characters.  */
public class UserNameCheckerException {
    public static void main(String[] args) {
        try {
            checkUserName("Bob");

        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static void checkUserName(String userName) {
        if (userName.length() < 5) {
            throw new RuntimeException("Username must be more than 4 characters");
        }
    }
}