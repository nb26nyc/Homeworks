package HW10;

public class Task6 {
    public static void main(String[] args) {
                /*
        Create 2D array of countries: north america countries, south america countries,
         europe countries, asian countries, african countries. Then print all values from
         that array using 2 different loops
        and calculate how many total countries been stored.
         */
        String[][] countries = {
                {"USA", "Canada"},
                {"Brazil", "Argentina", "Chile", "Colombia"},
                {"UK", "Germany", "France", "Italy", "Sweden"},
                {"Senegal", "Camerun", "SouthAfrica", "Morroco"},
                {"Japan", "SouthKorea", "Vietnam", "China", "Thailand"}
        };

        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                sum++;
            }
            System.out.println();
        }
        System.out.println();

        for (String[] NewCountries : countries) {
            for (String newC : NewCountries) {
                System.out.print(newC + " ");

            }
            System.out.println();
        }


        System.out.println("Total countries: " + sum);
    }
}
