package HW20;

public class CreditCard {
    /*
Create a class CreditCard and define variable balance
 and interest. Create an instance method that will calculate
  interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method
 calculate interest.
Call the method by creating an object of each of the three
 classes.
 */
    double balance;
    double interest;

    void Calculate(){
        System.out.println(balance*interest);
    }
    void Calculate (double balance,double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println(balance*interest);
    }
}
class Visa extends CreditCard{

}

class AX extends CreditCard{
    @Override
    void Calculate() {
        System.out.println("you are not eligible for CreditCard");

    }
}
class CreditTester{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.Calculate(900000.0,100.0);

        Visa visa=new Visa();
        visa.Calculate(50000.0,150.0);

        AX ax=new AX();
        ax.Calculate();
    }
}
