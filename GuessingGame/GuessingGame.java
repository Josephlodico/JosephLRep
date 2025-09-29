import javax.swing.JOptionPane;
import java.util.Random;
/*     NAME                           DATE                      DESCRIPTION
   Joseph Lodico            Monday, September 22 2025      Guessing Game Exercise    */ 

public class GuessingGame {
    public static void main(String[] args){

        Random random = new Random();
        int tryCount = 0;
        int playerGuess = -1;
        int playAgain;

        //asking for name and age of player
        String name = JOptionPane.showInputDialog("Welcome! What's your name?");
        String ageInput = JOptionPane.showInputDialog("Hi "+ name + "! How old are you?");
        int age = Integer.parseInt(ageInput);


        //asking for the maximum number
        String maxInput = JOptionPane.showInputDialog
        ("Enter the maximum Number for the guessing range:");
        int maxNumber = Integer.parseInt(maxInput);

        // this generates a random number between 1 and maxnumber
        int targetNumber = random.nextInt(maxNumber) + 1;

        //The GuessingGame loop
        while(playerGuess != targetNumber){
            String guessInput = JOptionPane.showInputDialog
            ("Guess a number between 1 and " + maxNumber + ";");
            playerGuess = Integer.parseInt(guessInput);
            tryCount ++;

            if (playerGuess < targetNumber){
                JOptionPane.showMessageDialog
                (null, "Too low!, try a higher number.");
            }
            else if (playerGuess > targetNumber){
                JOptionPane.showMessageDialog
                (null, "Too high!, try a lower number.");
            }
            else{
                JOptionPane.showMessageDialog
                (null, "Congrats, " + name + " you guessed the number in " + tryCount + " attempts.");
            }
        }
        // asking the player to play again
        playAgain = JOptionPane.showConfirmDialog(null,
        "Do you want to play again?", "Play Again,", JOptionPane.YES_NO_OPTION);
        while(playAgain == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null, "Thanks for playing! Goodbye");
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
