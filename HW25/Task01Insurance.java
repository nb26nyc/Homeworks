package HW25;
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
     and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel and
     Class Pet has petType attribute. Create 3 objects of the subclasses and store them in ArrayList.
     Using for loop/advanced for loop/ iterator access all methods of the class.
      */

import java.util.ArrayList;

public abstract class Task01Insurance {
    String insuranceName;

    abstract void getQuote();

    abstract void cancelInsurance();
}

class Car extends Task01Insurance {
    String carModel;

    public Car(String insuranceMame, String carModel) {
        this.insuranceName = insuranceMame;
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Getting " + insuranceName + " for " + carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling " + insuranceName + " for " + carModel);
    }
}

class Pet extends Task01Insurance {
    String petType;

    Pet(String insuranceName, String petType) {
        this.insuranceName = insuranceName;
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Getting " + insuranceName + " for " + petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling " + insuranceName + " for " + petType);
    }
}

class Health extends Task01Insurance{
    Health(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    @Override
    void getQuote() {
        System.out.println("Getting " + insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling " + insuranceName);
    }
}

class InsuranceTester {


    public static void main(String[] args) {
        ArrayList<Task01Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Car Insurance", "Honda"));
        insurances.add(new Pet("Pet Insurance", "Cat"));
        insurances.add(new Health("Health Insurance"));

        for (Task01Insurance insurance : insurances) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}
