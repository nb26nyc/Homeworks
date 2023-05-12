package HW10;

public class Task3 {
    public static void main(String[] args) {
               /*
        Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
        */
        String[][] list = {
                {"Potatoes", "Onion", "Carrots", "Garlic"},
                {"Oranges", "Apples", "Bannanas", "Lemon", "Strawberry"},
                {"Milk", "SourCream", "CreamCheese", "Cheese"},
                {"Biscuit", "Chocolade", "IceCream", "Donuts", "Cookies"}

        };

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        for (String[] list1 : list) {
            for (String list2 : list1) {
                System.out.print(list2 + " ");

            }
            System.out.println();
        }
    }
}
