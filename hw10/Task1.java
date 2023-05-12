package HW10;

public class Task1 {
    public static void main(String[] args) {
        /*
Create a 2D array(shorter way) in which first array will consist of 4 names and second
array will contain grades. Then your program should print name of the students that has
 A and B grade
 */


        String[][] arr = {
                {"Jessy", "Monika", "Matthew", "Lucas"},
                {"A", "B", "C", "D",}
        };

        System.out.print(arr[0][0] + " " + arr[1][0]);
        System.out.println();
        System.out.print(arr[0][1] + " " + arr[1][1]);
    }
}
