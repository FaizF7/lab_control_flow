import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

        System.out.println("\nWelcome! Guess the secret number! Follow the hints and keep guessing until you can find the secret number. \nStart by guessing a number!");
        Scanner reader = new Scanner(System.in);
        int guess = reader.nextInt();
        int secretNumber = 76;

        while ( guess != secretNumber) {
            if (guess > secretNumber) {
                System.out.println("Lower");
            } else if (guess < secretNumber) {
                System.out.println("Higher");
            }
            System.out.println("Try again!");
            guess = reader.nextInt();
        }

        System.out.println("Well done!\nGAME OVER");

    }
}
