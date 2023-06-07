package HW26;
import java.util.HashMap;
import java.util.Map;

/*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
     Output should be in the below format:John Smith=$100000
     */

public class Employee {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Bob Dylan", 100000.0);
        map.put("Jane Good", 120000.0);
        map.put("Ken White", 150000.0);
        map.put("Joshua Steel", 85000.0);
        String highestPaidEmployee = "";
        double highestSalary = 0;
        for (var entry : map.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestPaidEmployee = entry.getKey();
            }
        }
        System.out.println(highestPaidEmployee + " = $" + highestSalary);
    }
}
