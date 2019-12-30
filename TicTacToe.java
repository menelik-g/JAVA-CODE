/**
Menelik Gebremariam FINISHED ON: 12/21/2019
Project: Tic-tac-toe 2-player Game
The game is simple: Tic-tac-toe, and will be 2-players only. Player 1 is X, player 2 is O.
Then, it should be grid based, which should allow a user to put an x or o by typing in coordinates.
of where they want to place.
Method for print board.
Method for doublearray that reads characters.
Method for double array to keep track of filled spaces.
Method to keep track of whos turn it is.
Exception handling for entering into wrong space.
Exception handling for typing spot choice in wrong format.
Exception handling for entering a spot that doesn't exist.
*/
import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;
public class TicTacToe
{
   public static void main(String[] args)
   {
   String i = " ";
   Scanner in = new Scanner(System.in);
   do{
     String[][] board = {                 //Create double array so that the spaces are blank and not null
                        {" ", " ", " "},
                        {" ", " ", " "},
                        {" ", " ", " "}
     };
     boolean[][] checkFilled = {                 //Create boolean array to tell user if space is filled or not
                        {false, false, false},
                        {false, false, false},
                        {false, false, false}
     };
     displayRules();                     //Displays instructions and title
     String winner = " ";
     int turns = 0;
     int playerOneRow = 0;
     String playerOneColumn = " "; //Column for player ones choice!
     int actualOneColumn = 0;
     int playerTwoRow = 0;
     String playerTwoColumn = " "; //Column for player twos choice
     int actualTwoColumn = 0;
     while(winner.equals(" ") && turns < 9){
         gameBoard(board); //Creates board
         rulesPlayerOne(); //Rules for X's
         int x = 0;
         do{
           try{
            System.out.print("Player One's Row: "); 
            playerOneRow = in.nextInt(); //Allows player to enter their choice of row on the board!
            System.out.print("Player One's Column: ");    
            playerOneColumn = in.next(); //Allows player to enter their choice of column on the board!
            playerOneColumn = playerOneColumn.toUpperCase(); //Capitalizes the column letter entered         
             actualOneColumn = columnInBounds(playerOneColumn); //Calls method to translate the letter to a number column on the board
             if(checkFilled[playerOneRow - 1][actualOneColumn] == false){ //if,else checks if row and column are not out of bounds of the board array
               x = 1;
               checkFilled[playerOneRow - 1][actualOneColumn] = true; //sets the location on the boolean array to true, its filled!
               board[playerOneRow - 1][actualOneColumn] = "X";
               }
             else{
               x = 0;
               System.out.println("--------------------------------------------------------------------");
               System.out.println("Space already taken! Please retype Row and Column of an empty space:");
               System.out.println("--------------------------------------------------------------------");
               }  
              } 
          catch(ArrayIndexOutOfBoundsException exception){ //Catches exception if user enters a location outside of the array
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("ERROR:Space does not exist, Pay attention to the row numbers and column letters!");
            System.out.println("--------------------------------------------------------------------------------");}
          catch(InputMismatchException exception){ //Catches if user entered a letter for rows or a number for columns
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("ERROR: Don't enter a letter in with rows, don't enter a number with columns!");
            System.out.println("----------------------------------------------------------------------------");}
            in.nextLine();
      }while(x == 0);
      winner = threeInARow(board); //Updates winner
      if(!(winner.equals(" "))){ 
         gameBoard(board);
         break;}
      else if(allFilled(checkFilled) == true)
        {break;}     
      turns++; //There could only be 9 turns in tic-tac-toe
      gameBoard(board); //Creates board
      rulesPlayerTwo(); //Rules for O's
      int o = 0;
      do{
         try{
         System.out.print("Player Two's Row: "); 
         playerTwoRow = in.nextInt(); //Allows player to enter their choice of row on the board!
         System.out.print("Player Two's Column: ");   
         playerTwoColumn = in.next(); //Allows player to enter their choice of column on the board!
         playerTwoColumn = playerTwoColumn.toUpperCase();
         actualTwoColumn = columnInBounds(playerTwoColumn); //Calls method to convert string column to a number on the board
         if(checkFilled[playerTwoRow - 1][actualTwoColumn] == false) //If,else checks if row and column entered by user is in bounds of the array
          {
            o = 1;
            checkFilled[playerTwoRow - 1][actualTwoColumn] = true; //sets the location on the boolean array to true, its filled!
            board[playerTwoRow - 1][actualTwoColumn] = "O";
          }
         else
          {
            o = 0;
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Space already taken! Please retype Row and Column of an empty space:");
            System.out.println("--------------------------------------------------------------------");
          }
         }
         catch(ArrayIndexOutOfBoundsException exception){
           System.out.println("-------------------------------------------------------------------------");
           System.out.println("ERROR: Space does not exist, Pay attention to the row and column numbers!");
           System.out.println("-------------------------------------------------------------------------");}
         catch(InputMismatchException exception){
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("ERROR: Don't enter a letter in with rows, don't enter a number with columns!");
            System.out.println("----------------------------------------------------------------------------");}
            in.nextLine();
     }while(o == 0);  
      winner = threeInARow(board); //Updates winner
      if(!(winner.equals(" ")))
        {gameBoard(board);
         break;}
      else if(allFilled(checkFilled) == true)
      {break;}   
      turns++;
     }
    displayResults(winner);
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
   Checks to see if all 9 places on the game board is filled
   @param is boolean double array checkfilled
   @return true or false if all 9 slots are filled!
   */
   public static boolean allFilled(boolean[][] checkFilled)
   {
   for (int i = 0; i < checkFilled.length; i++){
     for(int j = 0; j < checkFilled[0].length; j++) {
         if (checkFilled[i][j] == false) return false;
        }
     }
      return true;
   }
   /**
   Converts column letter into a number to search the array
   @param is the entered column by either player 1 or player 2
   @return is column number of array that is equivalent to letter
   */
   public static int columnInBounds(String playerColumn)
   {
     if(playerColumn.equals("A"))
     {return 0;}
     else if(playerColumn.equals("B"))
     {return 1;}
     else if(playerColumn.equals("C"))
     {return 2;} 
     else
     {return 3;} 
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
    System.out.println("PLAYER 1's TURN: Type in row and then column for X");
    System.out.println("Rows are horizontal and labeled to the left of the board!");
    System.out.println("Columns are vertical and labeled on top of the board!");   
   }
   /**
   Prints the rules for player two with O's
   @param is none
   @return is none
   */
   public static void rulesPlayerTwo()
   {
    System.out.println("PLAYER 2's TURN: Type in row and then column for O");
    System.out.println("Rows are horizontal and labeled to the left of the board!");
    System.out.println("Columns are vertical and labeled on top of the board!");     
   }
    /**
    Displays winning results for either X winning, O winning, or TIE
    @param is String winner to see who won
    @return is none
    */
    public static void displayResults(String winner)
    {
    if(winner.equals("X"))
    {
      System.out.println("***************************************************************************");
      System.out.println("                         TIC-TAC-TOE: X's HAVE WON!                        ");
      System.out.println("Three in a ROW! Thanks for playing! A winner has been reached! If you wish ");
      System.out.println("to play TIC-TAC-TOE again then simply type in Yes to restart the game again");
      System.out.println("                      Thanks again for play my code!                       ");
      System.out.println("***************************************************************************");
    }
     else if(winner.equals("O"))
     {
      System.out.println("***************************************************************************");
      System.out.println("                        TIC-TAC-TOE: O's HAVE WON!                         ");
      System.out.println("Three in a ROW! Thanks for playing! A winner has been reached! If you wish ");
      System.out.println("to play TIC-TAC-TOE again then simply type in Yes to restart the game again");
      System.out.println("                      Thanks again for play my code!                       ");
      System.out.println("***************************************************************************");
     }
     else
     {
      System.out.println("***************************************************************************");
      System.out.println("                         TIC-TAC-TOE: C.A.T, TIE!                          ");
      System.out.println("There has been a tie! Thanks for playing! A tie has occured! If you wish to");
      System.out.println(" play TIC-TAC-TOE again then simply type in Yes to restart the game again  ");
      System.out.println("                      Thanks again for play my code!                       ");
      System.out.println("***************************************************************************");
     }
    }
   } 