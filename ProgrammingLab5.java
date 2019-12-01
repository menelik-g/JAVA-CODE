/**
Java Program #5
Print 3 parallel arrays to show students assessment test scores, and standard deviation
Use 4 methods that read-in the test scores and store into an array, compute class average from test scores, compute
deviation from the mean, and that displays arrays into neat- columns!
Currently there are seven students in your class named: Bashful, Doc, Dopey, Grumpy, Happy, Sleepy, and Sneezy.
What should print:
Enter(Student) score: (score) *7
The average test score is: (average)
Name |  Grade | Mean Deviation |
Names   Grades  Standard
Go      Go      Deviation
Here    Here    Goes Here
FOR USER: Follow directiions in the RunI/O and enter in the scores.                 
*/
import java.util.*;
import java.util.Scanner;
public class ProgrammingLab5
{
   public static void main(String[] args)
   {
      String[] names = {"Bashful", "Doc", "Dopey", "Grumpy", "Happy", "Sleepy", "Sneezy"}; //Array for 7 students
      double[] scores = testScores(); //Calls for the double array testScores method
      double average = testAverage(scores); //Calls for double testAverage with parameters as the array scores.
      System.out.printf("The average of the scores is: %.2f\n", average); //Prints the average of the scores and is formatted to two decimal places.
      double[] deviation = testDeviation(scores, average); //Calls for double array method testDeviation and parameters are scores and the average
      displayArrays(names, scores, deviation); //Calls for void method displayArrays with parameter arrays names, scores, and deviation
   }
   /**
   Prompts for user input for each student and is then placed into a double array
   @param is none for this method
   @return is the double array of scores
   */
   public static double[] testScores()
   {
      Scanner in = new Scanner(System.in);
      double[] testScores = new double[7];
         System.out.print("Enter Bashful's Score: ");   
         testScores[0] = in.nextDouble();
         System.out.print("Enter Doc's Score: ");
         testScores[1] = in.nextDouble();
         System.out.print("Enter Dopey's Score: ");
         testScores[2] = in.nextDouble();
         System.out.print("Enter Grumpy's Score: ");
         testScores[3] = in.nextDouble();
         System.out.print("Enter Happy's Score: ");   
         testScores[4] = in.nextDouble();
         System.out.print("Enter Sleepy's Score: ");
         testScores[5] = in.nextDouble();
         System.out.print("Enter Sneezy's Score: ");
         testScores[6] = in.nextDouble();
         return testScores;
   }
   /**
   Computes the average of the test scores by adding all the elements from the array testScores and dividing by array length
   @param is the double array testScores
   @return is the double value of the average rounded to two decimal places when printed
   */
   public static double testAverage(double[] testScores)
   {
      double total = 0;
      for (double element : testScores) //for each element in the array testScores
        {
           total = total + element;
        }
        double average = 0;
      if (testScores.length > 0) //if the testscore length is greater than 0 at the end of the for loop, then calculate average
      {
         average = (total / testScores.length);
      } 
      return average;
   }
   /**
   Computes the mean deviation of each of the students scores by subtracting each score buy the average score
   @param are the double array testScores and the average
   @return is the double array for each students test deviation
   */
   public static double[] testDeviation(double[] testScores, double average)
   {
      double[] testDeviation = Arrays.copyOf(testScores, testScores.length); //Copys all the contents from testScores
      for (int i = 0; i < testDeviation.length; i++) //Loop to calculate the deviation for each score in testScores
       {
         testDeviation[i] = testDeviation[i]-average;
       }
      return testDeviation;
   }
   /**
   Displays the three returned arrays in nice, easy-to-read, columns
   @param are the string array for the names, double array for the test scores, and double array for the test deviations
   @return is nothing because it is a void method
   */
   public static void displayArrays(String[] names, double[] testScores, double[] testDeviation)
   {
    System.out.println("Menelik Gebremariam                          11/24/2019");
    System.out.println("Name                 Scores                  Deviation               ");
    for (int i = 0; i < 7; i++) 
    {
      System.out.printf("%-10s %15s %24.2f \n", names[i], testScores[i], testDeviation[i]); //Displays 3 arrays for names, scores, and deviation
    }
   }

}