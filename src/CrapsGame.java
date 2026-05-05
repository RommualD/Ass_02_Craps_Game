import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        String playAgain;

        do {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Roll: " + die1 + " + " + die2 + " = " + sum);


            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose.");

            }

            else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win.");
            }

            else {
                int point = sum;
                System.out.println("Point is set to: " + point);

                boolean rolling = true;

                while (rolling) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Roll: " + die1 + " + " + die2 + " = " + sum);
                    System.out.println("Trying for point...");

                    if (sum == point) {
                        System.out.println("Made the point! You win.");
                        rolling = false;
                    }
                    else if (sum == 7) {
                        System.out.println("Rolled a 7! You lose.");
                        rolling = false;
                    }
                }
            }

            System.out.print("Play again? (y/n): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
    }
}