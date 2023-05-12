package HW9;

public class Task4 {
    public static void main(String[] args) {
                /* Create an array of cars and store 6 elements into it. Using 2 different
           loops print all values from the array.
        */

        String [] cars={"Bmw","Audi","Honda","Toyota","GMC","Dodge"};

        for (int i=0;i< cars.length;i++){
            System.out.println(cars[i]+" ");
        }
        System.out.println();

        for (String car: cars){
            System.out.println(car+" ");
        }
    }
}
