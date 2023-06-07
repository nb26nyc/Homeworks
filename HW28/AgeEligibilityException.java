package HW28;
/*
    Create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16.

 */


public class AgeEligibilityException {
    public static void main(String[] args) {
        try {
            checkAgeEligibility(15);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age is less than 16");
        }
    }
}
