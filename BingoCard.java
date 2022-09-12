/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingogame;
import java.util.*;
import java.util.Random;


/**
 *
 * @author edusa
 */

public class BingoCard 
        
        
{
    private int[][] bingoCardArray = new int [5][5]; // creates the bingoCardArray 2D array
                                                    // contains 5 rows and 5 columns
    public BingoCard()
    {
        Random random= new Random();
        
        for (int row = 0; row < bingoCardArray.length; row++ )
        {
            for (int col = 0;  col < bingoCardArray[row].length; col++)
            {
                bingoCardArray[row][0] = random.nextInt(15)+1;      //populates the array with the random range of integers
                bingoCardArray[row][1] = random.nextInt(15)+16;
                bingoCardArray[row][2] = random.nextInt(15)+31;
                bingoCardArray[row][3] = random.nextInt(15)+46;
                bingoCardArray[row][4] = random.nextInt(15)+61;
                

                System.out.print(bingoCardArray[row][col]); // prints the orginal game  card array
                System.out.print(" ");                      // prints the game card array without the zeros replacing the matching integers
                
            }
                System.out.println("  ");
                
            
        }
        
        System.out.println(" "); 
        
        //generate random numbers to put in 2D array
        // first column can only have 1-15 as the random number.
        
    }
    
    public void checkBingo (int aNum)   // checks if Anum is found in the rows and columns
                                        // of the array.
    {
        
        
        for (int row = 0; row <= 4; row++)
    {  
        
        
     
    if (aNum == bingoCardArray[row][0])          // if aNum matches then the value in the array is replaced with a zero.

            {
                bingoCardArray[row][0] = 0;
            }
            
            else if(aNum == bingoCardArray[row][1])
            {
                bingoCardArray[row][1]=0;
            }
            
            else if(aNum == bingoCardArray[row][2])
            {
                bingoCardArray[row][2]=0;
            }
            
            else if(aNum == bingoCardArray[row][3])
            {
                bingoCardArray[row][3]=0;
            }
            
            else if(aNum == bingoCardArray[row][4])
            {
                bingoCardArray[row][4]=0;
            }
           
    
            
            
    
            
            
      
           
           
        }
           
    }
    
        
        //Recieve num and check to see if it exists in the 2-D array
        //if it finds it a 0 will be put in the numbers place
        
        
        
        
    
    
    public boolean gotBingo ()
    {
        int count0s = 0;
        boolean gameWon = false;



    for (int row = 0; row < bingoCardArray.length && !gameWon; row++) // checks the rows of the Array to find
    {                                                                 // 5 matching zeros in a row.
    count0s = 0;
        for (int col = 0; col < bingoCardArray[row].length; col++)
    {
        if (bingoCardArray[row][col] == 0)
    {
    count0s++;
    }
    }
        if (count0s == 5)
    {
        System.out.println("Winner!!!");                            // if 5 zeros in a row are found the card is declared a winner
        gameWon = true;                                             
        return true;
        
    
    }
    }
    
        
    for (int col = 0; col < bingoCardArray.length && !gameWon; col++) // checks columns to find 5 matching zeros
    {
        count0s=0;
        for(int row = 0; row < bingoCardArray[col].length; row++ )
        {
            if(bingoCardArray[row][col] == 0)
            {
                count0s++;
            }
            if (count0s == 5)
            {                                       
                System.out.println("Winner!!!");
                gameWon = true;
                return true;
                
            }
        }
        
    }   // loops to check first diagonal
        if(  (bingoCardArray[0][0]==0 && bingoCardArray[1][1]==0 && bingoCardArray[2][2]==0 && bingoCardArray[3][3]==0 && bingoCardArray[4][4]==0)
         ||(bingoCardArray[4][4]==0 && bingoCardArray[3][3]==0 && bingoCardArray[2][2]==0 && bingoCardArray[1][1]==0 && bingoCardArray[0][0]==0) )
        {
            
            System.out.println("Winner!!!");
            gameWon = true;
            return true;
        }
            //loops to check second diagonal
        if(  (bingoCardArray[4][0]==0 && bingoCardArray[3][1]==0 && bingoCardArray[2][2]==0 && bingoCardArray[1][3]==0 && bingoCardArray[0][4]==0)
         ||(bingoCardArray[0][4]==0 && bingoCardArray[1][3]==0 && bingoCardArray[2][2]==0 && bingoCardArray[3][1]==0 && bingoCardArray[4][0]==0) )
        {
            System.out.println("Winner!!!");
            gameWon = true;
            return true;
            
        }
        

        else 
        {
            System.out.println("Sorry you did not win this time."); // prints when card is not a winner.
            
        }

        
        //loops to check every row and column if 5 zeros have been found 
       
        
        return false;
    }
    
    public String toString() // method to print the array with the zeros replacing the values.
    {
        System.out.printf("B  I  N  G  O \n");  
        for (int row = 0; row < bingoCardArray.length; row++ )
        {
            for (int col = 0;  col < bingoCardArray[row].length; col++)
            {
                System.out.print(bingoCardArray[row][col]);
                System.out.print(" ");
                
            }
           System.out.println("  ");
    
        }
        //return a string that contains the entire BINGO card including the headers of BINGO
        // and all the rows below it
        return "";
    }
    
}
