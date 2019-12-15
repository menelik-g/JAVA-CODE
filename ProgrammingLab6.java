/**
Java Programming lab 6
File I/O, practice with reading input files and writing to output files
Throw exceptions when needed
Process for program:
1. Take in input file from Hotel Expenses, display error if input file is not found
2. Read file line by line, keeping a total for each kind of service provided
3. Then display total amount of each service category, and write to a output file
Use fileNotFoundException
Use a delimiter in.useDemiliter(";"); to tokenize each input line based on semi-colons.
*/
import java.util.NoSuchElementException;
import java.lang.*;
import java.util.Scanner;
import java.io.*; 
public class ProgrammingLab6
{
   public static void main(String[] args) 
   {
     try{
       String inFileName = " ";
       String outFileName = " ";
       inFileName = userInFile(inFileName); //Set input file equal to input file name
       outFileName = userOutFile(outFileName); //Set output file equal to output file name
       File inputFile = new File(inFileName); //Open input file
       Scanner in = new Scanner(inputFile); //Use in for scanner objects within the inputfile
       PrintWriter out = new PrintWriter(outFileName); //Print writer to print to output file
       double lodgingTotal = 0;
       double conferenceTotal = 0;
       double roomServiceTotal = 0;
       double dinnerTotal = 0;
       double spaTotal = 0;
       while(in.hasNextLine()) //While the input file has another line of content
       { 
        String line = in.nextLine();
        Scanner reader = new Scanner(line); //Use this scanner for each line in the input file
        reader.useDelimiter(";"); //Instead of white space, use semi-colon to mark the end of a word
        String name = reader.next(); //Reads first word before semicolon
        String type= reader.next();//Reads second word before semicolon
        double cost = reader.nextDouble(); //Save cost of the double
        String date = reader.next();
        if(type.equals("Lodging"))//if the cost was from lodging
        {lodgingTotal = lodgingTotal + cost;}
        if(type.equals("Conference"))//if the cost was from conferences
        {conferenceTotal = conferenceTotal + cost;}
        if(type.equals("Room Service"))//if the cost was from room service
        {roomServiceTotal = roomServiceTotal + cost;}
        if(type.equals("Dinner"))//if the cost was from dinners
        {dinnerTotal = dinnerTotal + cost;}
        if(type.equals("Spa"))//if the cost was from the spa
        {spaTotal = spaTotal + cost;}
       }
      displayResult(lodgingTotal, conferenceTotal, roomServiceTotal, dinnerTotal, spaTotal, out);//Calls for method to calculate and display results
      in.close();//close input file
      out.close();// close output file
     }
     catch (FileNotFoundException exception)
      {System.out.println("The input file was not found!");}
     catch (NoSuchElementException exception)
      {System.out.println("The format of the input is invaild!");}
   }
   /**
   Asks for user to enter in the name and location of the input file
   @param is the string inFileName
   @return the inputted name of the input file
   */
   public static String userInFile(String inFileName) throws FileNotFoundException
   {
     Scanner console = new Scanner(System.in);
     System.out.print("Enter Input File: ");
     inFileName = console.next();
     return inFileName;
   }
   /**
   Asks for user to enter name of the output file they wish to create
   @param is the string outFileName
   @return the inputted name of the output file 
   */
   public static String userOutFile(String outFileName)
   {
     Scanner console = new Scanner(System.in);
     System.out.println("If you do not have a output file then it will create one for you automatically!");
     System.out.print("Enter Output File: ");
     outFileName = console.next();
     return outFileName;
   }
   /**
   Displays the total cost of each type of cost in the hotel in the compiler and into the output file
   @param is the printwriter, total of lodging cost, total of conference cost, total of room service costs, total of dinner cost, total of spa cost
   @return is nothing because the method is void
   */
   public static void displayResult(double lodgingTotal,double conferenceTotal,double roomServiceTotal,double dinnerTotal,double spaTotal,PrintWriter out)
   {
    System.out.printf("Lodging:      %10.2f\n", lodgingTotal);//Displays to compiler
    System.out.printf("Conference:   %10.2f\n", conferenceTotal);
    System.out.printf("Room Service: %10.2f\n", roomServiceTotal);
    System.out.printf("Dinner:       %10.2f\n", dinnerTotal);
    System.out.printf("Spa:          %10.2f\n", spaTotal);
    out.printf("Lodging:      %10.2f\n", lodgingTotal);//Displays to output files
    out.printf("Conference:   %10.2f\n", conferenceTotal);
    out.printf("Room Service: %10.2f\n", roomServiceTotal);
    out.printf("Dinner:       %10.2f\n", dinnerTotal);
    out.printf("Spa:          %10.2f\n", spaTotal);
   }      
}