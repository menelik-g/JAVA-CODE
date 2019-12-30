/**
Project: Tic-tac-toe 2-player Game
The game is simple: Tic-tac-toe, and will be 2-players only. Allows user to pick if they want x"s or o"s.
Then, it should be grid based, which should allow a user to put an x or o by typing in coordinates
of where they want to place.
Method for print board
Method for doublearray that reads characters
Method to keep track of whos turn it is
Method to pick x or o for player1 and player2
*/
import java.util.NoSuchElementException;
import java.io.*;
import java.util.Scanner;
public class TicTacToe
{
   public static void main(String[] args)
   {
   String i = " ";
   Scanner in = new Scanner(System.in);
   do
   {
    displayRules();                     //Displays instructions and title
    int turns = 1;
    String[][] board = {                 //Create double array so that the spaces are blank and not null
                        {" ", " ", " "},
                        {" ", " ", " "},
                        {" ", " ", " "}
    };
    boolean[][] isEmpty = {                 
                           {false, false, false},
                           {false, false, false},
                           {false, false, false}
                           };
    String winner = " ";
    String playerOneInput = " ";
    String playerTwoInput = " ";
    while(winner.equals(" ") && turns < 9)
     {
      gameBoard(board); //Creates board
      rulesPlayerOne(); //Rules for X's
      playerOneChoice(board); //Updates the game board 
      winner = threeInARow(board); //Updates winner
      if(!(winner.equals(" "))) 
        {gameBoard(board);
         break;}
      turns++; //There could only be 9 turns in tic-tac-toe
      gameBoard(board); //Creates board
      rulesPlayerTwo(); //Rules for O's
      try{
         playerTwoInput = in.next(); //Allows player two to enter where they would like to put an O
         playerTwoInput = playerTwoInput.toUpperCase();
      }
      catch(NoSuchElementException exception)
         {System.out.println("Input from player 2 is invalid! Follow instructions!");}
      playerTwoChoice(playerTwoInput, board); //Updates the game board
      winner = threeInARow(board); //Updates winner
      if(!(winner.equals(" ")))
        {gameBoard(board);
         break;}
      turns++;
     }
    if(winner.equals("X"))
      {displayXResults();} // X's win
    else if(winner.equals("O"))
      {displayOResults();} //O's win
    else if(winner.equals(" "))
      {displayTieResults();} // CAT, or Tie
    System.out.print("     Would you like to play again? Yes or No: ");
    i = in.next();
    i = i.toUpperCase();
    }
    while(i.equals("YES"));
   }
   /**
   Creates the layout and borders on the tic-tac-toe board
   @param is the string 2D array board
   @return nothing because it is a void method
   */
   public static void gameBoard(String[][] board)
   {
    System.out.println("     A   B   C   ");
    System.out.println("   _____________");
    System.out.println("1  " +"| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
    System.out.println("   _____________");
    System.out.println("2  "+ "| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
    System.out.println("   _____________");
    System.out.println("3  "+"| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
    System.out.println("   _____________");
   }
   /**
   Checks the array if there is a three-in-a-row of X's or O's
   @param is the board to check values
   @result is a string to tell whether X, or O won
   */
   public static String threeInARow(String[][] board)
   {
     if((board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X"))||(board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X"))||(board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")))
     {return "X";}
     else if((board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X"))||(board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X"))||(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")))
     {return "X";}  
     else if((board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X"))||(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")))
     {return "X";}
     else if((board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O"))||(board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O"))||(board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")))
     {return "O";}  
     else if((board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O"))||(board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")))
     {return "O";}
     else if((board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O"))||(board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O"))||(board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")))
     {return "O";}
     else
     {return " ";}
   }
   /**
   Simply displays the rules and header for the game
   @param is none
   @return is none
   */
   public static void displayRules()
   {
     System.out.println("***************************************************************************");
     System.out.println("                      TIC-TAC-TOE GAME 2 PLAYERS                           ");
     System.out.println("Welcome to tic-tac-toe! Rules are simple! Get three of your symbol in a row");
     System.out.println("and you win! Player 1 has X's and Player 2 has O's! Follow the instructions");
     System.out.println("that are displayed! Board will be updated after each player's turn is done!");
     System.out.println("***************************************************************************");
   }
   /**
   Prints the rules for player one with X's
   @param is none
   @return is none
   */
   public static void rulesPlayerOne()
   {
    System.out.println("Player 1's Turn: Type in row and then column for X");
    System.out.println("For example: If you want Row 1-Column A, then you type 1A. Use CAPS for letters!");
    System.out.println("WARNING: DO NOT TYPE IN A SPACE THAT IS ALREADY FULL, THANK YOU!");   
   }
   /**
   Prints the rules for player two with O's
   @param is none
   @return is none
   */
   public static void rulesPlayerTwo()
   {
    System.out.println("Player 2's Turn: Type in row and then column for O");
    System.out.println("For example: If you want Row 1-Column A, then you type 1A.Use CAPS for letters!");
    System.out.println("WARNING: DO NOT TYPE IN A SPACE THAT IS ALREADY FULL, THANK YOU!");
    System.out.print("Player Two's Choice: ");      
   }
   /**
   Checks user input for where they want to place X symbol and translate it to the array
   @param is the string of placement user chose, and the board 2D array to place the symbol onto the board
   @return a string in a location on the game board
   */
   public static String playerOneChoice(String[][] board)
   {
    Scanner in = new Scanner(System.in);
    String isEmpty = " ";
   do{
    System.out.print("Player One's Choice, please enter an empty spot on the table: ");
    String playerOneInput = in.next();
    playerOneInput = playerOneInput.toUpperCase();
      if(playerOneInput.equals("1A"))
      {
         if(board[0][0].equals(" "))
         {
            board[0][0] = "X";
            return board[0][0];
         }
         else
         {break;}    
      }
      else if(playerOneInput.equals("1B"))
      {
        if(board[0][1].equals(" "))
        {
           board[0][1] = "X";
           return board[0][1];
        }
        else
        {break;}
      }
      else if(playerOneInput.equals("1C"))
      {
       if(board[0][2].equals(" "))
       {
         board[0][2] = "X";
         return board[0][2];
       }
       else
       {break;}  
      }      
      else if(playerOneInput.equals("2A"))
      {
      if(board[1][0].equals(" "))
       {
         board[1][0] = "X";
         return board[1][0];
       }
       else
       {break;}  
      }
      else if(playerOneInput.equals("2B"))
      {
       if(board[1][1].equals(" "))
        {  
         board[1][1] = "X";
         return board[1][1];
        }
        else
        {break;}
      }   
      else if(playerOneInput.equals("2C"))
      {
       if(board[1][2].equals(" "))
       {
         board[1][2] = "X";
         return board[1][2];
       }
       else
       {break;}
      }   
      else if(playerOneInput.equals("3A"))
      {
       if(board[2][0].equals(" "))
       {
         board[2][0] = "X";
         return board[2][0];
       }
       else
       {break;}  
      }
      else if(playerOneInput.equals("3B"))
      {
      if(board[2][1].equals(" "))
       {
         board[2][1] = "X";
         return board[2][1];
       }
       else
       {break;}
      }
      else if(playerOneInput.equals("3C"))
      {
       if(board[2][2].equals(" "))
        {  
         board[2][2] = "X";
         return board[2][2];
        }
        else
        {break;} 
      }
    } 
    while(isEmpty.equals(" "));
    return " ";
    }
   /**
   Checks user input for where they want to place O symbol and translate it to the array
   @param is the string of placement user chose, and the board 2D array to place the symbol onto the board
   @return a string in a location on the game board
   */
   public static String playerTwoChoice(String playerTwoInput, String[][] board)
   {
      if(playerTwoInput.equals("1A"))
      {
         board[0][0] = "O";
         return board[0][0];
      }
      else if(playerTwoInput.equals("1B"))
      {
         board[0][1] = "O";
         return board[0][1];
      }
      else if(playerTwoInput.equals("1C"))
      {
         board[0][2] = "O";
         return board[0][2];
      }
      else if(playerTwoInput.equals("2A"))
      {
         board[1][0] = "O";
         return board[1][0];
      }
      else if(playerTwoInput.equals("2B"))
      {
         board[1][1] = "O";
         return board[1][1];
      }   
      else if(playerTwoInput.equals("2C"))
      {
         board[1][2] = "O";
         return board[1][2];
      }   
      else if(playerTwoInput.equals("3A"))
      {
         board[2][0] = "O";
         return board[2][0];
      }
      else if(playerTwoInput.equals("3B"))
      {
         board[2][1] = "O";
         return board[2][1];
      }
      else if(playerTwoInput.equals("3C"))
      {
         board[2][2] = "O";
         return board[2][2];
      }
     else return(" ");
    }
    /**
    Displays winning results for X's
    @param is none
    @return is none
    */
    public static void displayXResults()
    {
     System.out.println("***************************************************************************");
     System.out.println("                         TIC-TAC-TOE: X's HAVE WON!                        ");
     System.out.println("Three in a ROW! Thanks for playing! A winner has been reached! If you wish ");
     System.out.println("to play TIC-TAC-TOE again then simply type in Yes to restart the game again");
     System.out.println("                      Thanks again for play my code!                       ");
     System.out.println("***************************************************************************");
    }
    /**
    Displays winning results for O's
    @param is none
    @return is none
    */
    public static void displayOResults()
    {
     System.out.println("***************************************************************************");
     System.out.println("                        TIC-TAC-TOE: O's HAVE WON!                         ");
     System.out.println("Three in a ROW! Thanks for playing! A winner has been reached! If you wish ");
     System.out.println("to play TIC-TAC-TOE again then simply type in Yes to restart the game again");
     System.out.println("                      Thanks again for play my code!                       ");
     System.out.println("***************************************************************************");
    }
    /**
    Displays results of a tie!
    @param is none
    @return is none
    */
    public static void displayTieResults()
    {
     System.out.println("***************************************************************************");
     System.out.println("                         TIC-TAC-TOE: C.A.T, TIE!                          ");
     System.out.println("There has been a tie! Thanks for playing! A tie has occured! If you wish to");
     System.out.println(" play TIC-TAC-TOE again then simply type in Yes to restart the game again  ");
     System.out.println("                      Thanks again for play my code!                       ");
     System.out.println("***************************************************************************");
    }
   } 