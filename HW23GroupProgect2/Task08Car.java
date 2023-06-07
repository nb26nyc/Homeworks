package HW23GroupProgect2;


    /*
    Create a Class Car that would have the following fields: price and color, and method calculateSalePrice()
     which should be returning a price of the car.
    Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight and has its own implementation
     of calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then
      returned car price should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it its own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    */

public class Task08Car {
    public static void main(String[] args) {
        Car sedan = new Sedan(20000, "white", 18);
        System.out.println("This " + sedan.color + " sedan's price is: $" + sedan.calculateSalePrice());

        Car truck = new Truck(40000, "black", 3500);
        System.out.println("This " + truck.color + " track's price is: $" + truck.calculateSalePrice());
    }
}

class Car {
    protected double price;
    protected String color;

    public Car(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double calculateSalePrice() {
        return price;
    }
}

class Sedan extends Car {
    private int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return price * 0.95;
        } else {
            return price * 0.9;
        }
    }
}

class Truck extends Car {
    private int weight;

    public Truck(double price, String color, int weight) {
        super(price, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return price * 0.9;
        } else {
            return price * 0.8;
        }
    }
}

