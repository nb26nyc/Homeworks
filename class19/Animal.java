package class19;

public class Animal {
    // create 3 classes like Dog Cat Horse define 5 properties in each class
    // access level
    // you can use inheritance to avoid code duplication
    // and one printInfo method that will print the values of these variables
    // create constructors as well in each child class to initialize those
    // properties create one object of each class and call the printInfo method


    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Animal(String name, String color, String breed, int age, double weight) {
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age + " " + weight);


            }
    }



   



