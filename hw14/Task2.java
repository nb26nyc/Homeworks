package HW14;

public class Task2 {
   /*
Create a method createEmail(). Based on values of users firstName,
 lastName and email type, your method should return complete email Address.
  Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */


    String createEmail(String firstName, String lastName, String emailType) {
        String email = firstName + lastName + "@" + emailType + ".com";

        return email;
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        System.out.println(obj.createEmail("Bob", "Jackson", "Gmail"));
    }
}
