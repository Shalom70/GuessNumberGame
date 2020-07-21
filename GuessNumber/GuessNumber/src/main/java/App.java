import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean playAgain = true;


        Guess game = new Guess();
        game.playGame();



        while (playAgain) {
            System.out.println("Do you want to play again? Press y for yes or n for no");
            choice = scanner.nextLine();

            if (choice.equals("y")) {
                Guess newGame = new Guess();

                newGame.playGame();

            }

            else if (choice.equals("n")) {
                playAgain = false;


            }

        }


    }
}

