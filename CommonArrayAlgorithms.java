/**
Contains all common array algorithms for future use
Menelik Gebremariam 11/11/2019
*/
import java.util.Scanner;
public class CommonArrayAlgorithms
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in); //Computes that average of a array
      double total = 0;
      for (double element : values)
        {
            total = total + element;
        }
        double average = 0;
        if (values.length > 0) { average = total / values.length; 
   }
   /**
   Algorithm that computes max and min. Seperated by space.
   */
   public static void maxAndMin()
   {
      double largest = values[0];
      for (int i = 1; i < values.length; i++)
      {
        if (values[i] > largest)
         {
            largest = values[i];
         }
      }
      
      double smallest = values[0];
      for (int i = 1; i < values.length; i++)
      {
        if (values[i] < smallest)
         {
            smallest = values[i];
         }
      }
   }
   /**
   Algorithm that adds a seperator for list
   */
   public static void elementSeperator()
   {
    for (int i = 0; i < values.length; i++)
      {
         if (i > 0) 
         { 
         System.out.print(" | "); 
         }
         System.out.print(values[i]); 
      }
   }
   /**
   Algorithm to search a array for a value linearly.
   */
   public static void linearSearch()
   {
      int searchedValue = 100;
      int pos = 0;
      boolean found = false;
      while (pos < values.length && !found)
      {
         if (values[pos] == searchedValue)
         {
            found = true;
         } 
         else 
         {
            pos++;
         }
      }
   }
   /**
   Algorithm that removes an element from a position and then reduces the size
   */
   public static void removeElement()
   {
      for (int i = pos + 1; i < currentSize; i++)
      { 
         values[i - 1] = values[i]; 
      }
         currentSize--;
   }
   /**
   Algorithm that inserts a new element into an array and increases the size
   */
   public static void insertElement()
   {
      if (currentSize < values.length)
      {
         currentSize++;
         for (int i = currentSize - 1; i > pos; i--)
         {
            values[i] = values[i - 1];
         }
      values[pos] = newElement;
      }
   }
   /**
   Algorithm that swaps two elements in an array by holding one in temp and then rewriting and then replace temp with a replacement
   */
   public static void swapElements
   {
      int i = 1;
      int j = 2;
      // Good swap
      double temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      // Bad swap
      a[i] = a[j];
      a[j] = a[i];
   }
   /**
   Algorithm that copys an arrays values and puts into a new array list
   */
   public static void copyArray
   {
      double[] prices = Arrays.copyOf(values, values.length);
   }
   /**
   Algorithm allows array to read in input
   */
   public static void readInputArray
   {
      int currentSize = 0;
      while (in.hasNextDouble() && currentSize < inputs.length)
      { 
         inputs[currentSize] = in.nextDouble();
         currentSize++;
      }
   }
   /**
   Alogrithm that finds the total of a row
   */
   public static void totalOfRow()
   {
      int total = 0;
      for (int j = 0; j < row length-1; j++)
      {
         total = total + counts[i][j];
      }
   } 
   /**
   Algorithm that finds the total of a column
   */
   public static void totalOfColumn()
   {
      int total = 0;
      for (int i = 0; i < column length-1; i++)
      {
         total = total + counts[i][j];
      }
   }
   /**
   Algorithm gives you the sum of all values in a two dimensional array
   */
   public static int sum(int[][] values)
   {
   int total = 0;
   for (int i = 0; i < values.length; i++)   
   {
      for (int j = 0; j < values[0].length; j++)
      {
         total = total + values[i][j];
      }
   }
   return total;
}
}