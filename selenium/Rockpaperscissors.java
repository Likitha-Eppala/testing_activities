import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (true) {
            // Get user choice
            String userChoice = getUserChoice();

            // Get computer choice
            String computerChoice = getComputerChoice();

            // Display choices
            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            String result = determineWinner(userChoice, computerChoice);

            // Display the result
            System.out.println(result);

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            // Check if the user wants to play again
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing. Goodbye!");
                break; // Exit the loop if the user doesn't want to play again
            }
        }
    }

    private static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        // Validate user input
        while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors: ");
            userChoice = scanner.nextLine().toLowerCase();
        }

        return userChoice;
    }

    private static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return choices[index];
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
