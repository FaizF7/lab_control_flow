import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Input weather:");
        String weather = reader.nextLine();
        System.out.println("Input temperature");
        int temp = reader.nextInt();

        System.out.println(weather);
        System.out.println(temp);

        if(weather.equalsIgnoreCase("rainy") && temp<=5){
            System.out.println("Wear winter raincoat, scarf, hat and gloves");
        } else if (weather.equalsIgnoreCase("rainy")){
            System.out.println("Wear raincoat");
        } else if ( weather.equalsIgnoreCase("sunny") && temp > 25){
            System.out.println("Wear a cap and t shirt");
        } else if ( weather.equalsIgnoreCase("sunny") && temp < 5){
            System.out.println("Wear a winter coat with woolies");
        } else if ( weather.equalsIgnoreCase("sunny") && temp < 25){
            System.out.println("Wear a cap and jacket");
        }

    }
}
