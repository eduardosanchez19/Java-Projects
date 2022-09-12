
package bingogame;

import java.util.Scanner;
import java.util.*;



/**
 * 6115334
 * Bingo Game challenge #1
 * COP 3804 Spring 2022 semester
 * 1/24/2022 : Date submitted
 */
public class BingoGame 
{

    
    
       
    public static int totalGamesWon=0;
    public static BingoCard myCard;
    
    public static void main(String[] args) //Main method
    {
        
        Scanner keyboard = new Scanner(System.in);
        String playAgain = "yes";
        
        
        
        
        
        do
        {
            myCard = new BingoCard();    // methods from the BingoCard class
            playGame();
            determineWinner();  
            System.out.println("Would you like to play again?" + " Enter YES to play again or NO to terminate game.");
            playAgain = keyboard.nextLine();
            
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("You won " + totalGamesWon + " Bingo games"); // informs the user how many games they won after 
    }                                                                    // the game is terminated.
    
    public static void playGame()   //PlayGame Method
    {
        int randomNumber = 0;
        Random random= new Random();
        
        for (int i = 0; i < 50; i++)
        {

            randomNumber = random.nextInt(75)+1;    // Generates a random int between 1 and 75.
            myCard.checkBingo(randomNumber);    // sends random int to the got bingo method
            
        }
         
        
        
    }
    
    
    public static void determineWinner()             // if 5 consecutive zeros are found wether horizontally 
    {                                                // vertically or diagonally Winner is declared.
        boolean isWinner = false;
        isWinner = myCard.gotBingo();
        
        if (isWinner)
        {
                   
            System.out.println("BINGO!!!");
            
            totalGamesWon++;
        }
        
        System.out.println("Here are your game results: ");
        System.out.println(myCard);
        
    }
    
}
