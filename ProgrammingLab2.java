/**
Found out what to do! Seasons of the year will be done! 
Menelik Gebremariam 10/21/19
*/
import java.util.Scanner;
public class ProgrammingLab2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("What is the month in numbers?");
      int month = input.nextInt();                        // Asks for the month in number form
      System.out.println("What is the day in the month?"); // Asks for the day within that month
      int day = input.nextInt();
      String season = "season";                                   
     if (1 <= month && 3 >= month)                         // If month is betweeen 1 and 3
      {
         season = "Winter";                               // Then season is set to Winter
      }
     else if (4 <= month && 6 >= month)                   // If month is between 4 and 6
     {
         season = "Spring";                               // Then season is set to Spring
     }
     else if (7 <= month && 9 >= month)                   // If month is between 7 and 9
     {
          season = "Summer";                               // Then season is set to Summer
     }
     else if (10 <= month && 12>= month)                  // If month is between 10 and 12
     {
          season = "Fall";                                 // Then season is set to fall
     }    
     else 
     {
     System.out.println("Sorry, but that month does not exist!");  // Month is either < 1 or > 12
     
   }  

    if (month % 3 == 0 && day >= 21)       // If the month is divisible by 3 and the day is 21 or greater
     {
         if (season.equals("Winter"))      // And if the season is Winter
         {
            season = "Spring";            // The season will be Spring
         }
         else if (season.equals("Spring"))  // And if the season is Spring
         {
            season = "Summer";              // The season will be Summer
         }
         else if (season.equals("Summer"))  // And if the season is Summer
         {
            season = "Fall";                // Then the season is fall
         }
         else season = "Winter";            //Else the season is winter
     }
     
     System.out.println("Menelik Gebremariam           10/28/2019");
     System.out.println("------------------------------------------");
     System.out.println("The month is : " + month);
     System.out.println("The day is: " + day);
     System.out.println("The season is: " + season);
      
      }
     
 
}
