package Template_method;
import java.util.Random;
import java.util.Scanner;

public class GuessAnswer extends Game {

    private int[] scores;
    private int roundsToWin;
    private Random random = new Random();  // Reuse Random object

    @Override
    public void initializeGame(int numberOfPlayers) {
        if (numberOfPlayers != 2) {
            throw new IllegalArgumentException("Guess the Answer is a two-player game.");
        }
        scores = new int[numberOfPlayers];
        roundsToWin = 3; // The first player to win 3 rounds wins the game
        System.out.println("Welcome to Guess the Answer! First to " + roundsToWin + " wins.");
    }

    @Override
    public boolean endOfGame() {
        return scores[0] == roundsToWin || scores[1] == roundsToWin;
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + (player + 1) + ", choose: 1 for 'Number A', 2 for 'Number B':");
        int playerChoice = scanner.nextInt();

        if (playerChoice < 1 || playerChoice > 2) {
            System.out.println("Invalid choice! Please choose again.");
            return;
        }

        int playerChoiceA = random.nextInt(9) + 1;  // Generates number between 1 and 9
        int playerChoiceB = random.nextInt(9) + 1;  // Generates number between 1 and 9

        System.out.println("Player " + (player + 1) + " picked number: " + playerChoiceA);
        System.out.println("Opponent picked number: " + playerChoiceB);

        if (playerChoiceA == playerChoiceB) {
            System.out.println("Both got the same number: " + playerChoiceA + ". It's a tie!");
        } else if (playerChoiceA > playerChoiceB) {
            System.out.println("Player " + (player + 1) + " wins the round!");
            scores[player]++;
        } else {
            System.out.println("Opponent wins the round!");
            scores[1 - player]++;
        }
    }

    @Override
    public void displayWinner() {
        if (scores[0] == roundsToWin) {
            System.out.println("Player 1 wins the game!");
        } else {
            System.out.println("Player 2 wins the game!");
        }
    }

    public static void main(String[] args) {
        Game game = new GuessAnswer();
        System.out.println("Welcome to the GuessAnswer game!");
        System.out.println("The game is played by two players.");

        game.play(2);
    }
}
