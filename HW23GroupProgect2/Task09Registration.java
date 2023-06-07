package HW23GroupProgect2;

/*
   Create Registration Class in which you would have variables as email, userName and password that have
    an access scope only within its own class. After creating an object of the class user should be able
    to call methods and in each method separately pass values to set users email, username and password.
   Requirements:
   A. Valid email consider to be only yahoo
   B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also, valid password cannot contain userName.
*/

public class Task09Registration {
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("ivan@yahoo.com");
        user.setUserName("IvanDon");
        user.setPassword("password");
    }
}

class Registration {
    private String email, userName, password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email. Only yahoo emails are allowed.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid userName. It cannot be empty and must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password. It cannot be empty, must be longer than 6 characters, and cannot contain the userName.");
        }
    }
}
