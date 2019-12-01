/** 
This program allows you to both calculate volume and area for any shape(WIP)
Gives both full calculation and calculation with Pi
Menelik Gebremariam 10/16/19
Update added a while loop so the calculator can be used multiple times! Nice!
Menelik Gebremariam 10/23/19
Found out how to add shapes and colors to calculator 
Menelik Gebremariam 10/25/19
Found a way to make code much more efficient! Look for spots with .equals() and replace with answer1, A1 or A2
Also create methods for each calculation(Its Easy!) Things are looking up!
Replace while with a do-while loop instead  to cut code in half?!?!
Menelik Gebremariam 11/6/19
Have replaced all with methods for easier debugging! Now lastly, to add option windows...
Menelik Gebremariam 11/15/19
*/
import javax.swing.*;
import java.util.Scanner;
public class VolumeOrArea
{
   public static void main(String[] args)
   {
   Scanner in = new Scanner(System.in);
   int i = 0;
  do
  {
   System.out.println("Do you want Volume or Area?");
   String answer1 = in.next();
   if (answer1.equals("Volume") || answer1.equals("volume"))    //If user picks Volume option
   {
      System.out.println("What shape do you want the Volume for?");
      String answerA1 = in.next();
      if (answerA1.equals("Cylinder") || answerA1.equals("cylinder"))  //If the user picks volume of cylinder
        {
         double radiusOfCylinder = 0;
         double heightOfCylinder = 0;
         System.out.printf("Volume of Cylinder is: %.2f\n", volumeCylinder(radiusOfCylinder, heightOfCylinder));    //Full Calculation
        }
      else if(answerA1.equals("Cube") || answerA1.equals("cube")) //If user picks volume of cube
         {
            System.out.println("What is the size of one of the sides of the cube?");
            double sideOfCube = in.nextDouble();
            double volumeOfCube = Math.pow(sideOfCube, 3); 
            System.out.printf("Volune of Cube is: %.2f\n", volumeOfCube);    //Full calculation
         }
      else if (answerA1.equals("Sphere") || answerA1.equals("sphere")) // If user picks volume of sphere
          {
            double radiusOfSphere = 0;
            System.out.printf("Volume of Sphere is: %.2f\n", volumeSphere(radiusOfSphere));     //Full calculation
          }
      else if (answerA1.equals("Cone") || answerA1.equals("cone"))   //If user picks volume of cone
          {
            double radiusOfCone = 0;
            double heightOfCone = 0;
            System.out.printf("Volume of the cone: %.2f\n" + volumeCone(radiusOfCone,heightOfCone));   //Full calculation
          }
        else {System.out.println("Can't find the volume of this shape! Try again!");}  
     }
      else if (answer1.equals("Area") || answer1.equals("area"))     //If user wants Area of a shape!
           {
            System.out.println("What shape do you want the area of?");
            String answerA2 = in.next();
         if (answerA2.equals("Square") || answerA2.equals("square"))    //If user wants area of square
           {
            System.out.println("What is the size of one of the sides?");
            double sideOfSquare = in.nextDouble();
            double areaOfSquare = sideOfSquare * sideOfSquare;
            System.out.printf("The area of the square is: %.2f\n", areaOfSquare);
           }
         if (answerA2.equals("Triangle") || answerA2.equals("triangle"))      //if user wants area of triangle!
           {
            double baseOfTriangle = 0;
            double heightOfTriangle = 0;;
            System.out.printf("The area of the triangle is: %.2f\n", areaTriangle(baseOfTriangle, heightOfTriangle));
           }
         if (answerA2.equals("Circle") || answerA2.equals("circle"))  // The user wants area of circumference of Circle
           {

            System.out.println("Circumference or Area of Circle?");
            String cOrA = in.next();                       //Circumference or Area
            if (cOrA.equals("Area") || cOrA.equals("area") || cOrA.equals("area of Circle") || cOrA.equals("Area of Circle"))              
            {
                double radiusOfCircle = 0;
                System.out.printf("The area of the circle is: %.2f\n", areaCircleR(radiusOfCircle));
            }
            else if (cOrA.equals("Circumference") || cOrA.equals("circumference") || cOrA.equals("Circumference of Circle") || cOrA.equals("circumference of circle"))//If user wants to find circumference of a circle
                {
                 System.out.println("Radius or Diameter?");
                 String rOrD = in.next();
                 if(rOrD.equals("Radius") || rOrD.equals("radius"))     //If radius is being used to find circumference
                     {
                      double radiusOfCircle = 0;
                      System.out.printf("The circumference of the circle is: %.2f\n", circumferenceCircleR(radiusOfCircle));    
                     }
                 else if (rOrD.equals("Diameter") || rOrD.equals("diameter"))
                    {
                     System.out.println("What is the diameter of the circle?");
                     double diameterOfCircle = 0;
                     System.out.printf("The circumference of the circle is: %.2f\n", circumferenceCircleD(diameterOfCircle));
                    }
           if (answerA2.equals("Trapezoid") || answerA2.equals("trapezoid")) //If user wants area of trapezoid
             {
               double heightOfTrapezoid = 0;
               double shortHorizontalLine = 0;
               double longHorizontalLine = 0;
               System.out.printf("The area of the trapezoid is: %.2f\n", areaTrapezoid(heightOfTrapezoid, shortHorizontalLine, longHorizontalLine));
             } 
           if (answerA2.equals("Parallelogram") || answerA2.equals("parallelogram"))  //If user wants area of parallelogram
             {
               double baseOfParallelogram = 0;
               double heightOfParallelogram = 0;
               System.out.printf("The area of the parallelogram is: %.2f\n", areaParallelogram(baseOfParallelogram, heightOfParallelogram));
             }      
                
            }     
         }
       else {System.out.println("Can't find the area of this shape! Try again!");} 
       }
       System.out.println("Would you like to use the calculator again? Yes or No?");
       String response = in.next();
         if(response.equals("Yes") || response.equals("yes"))
         {
            i = 1;
         }
        else
        {
            i = 0;
            System.out.println("Bye-bye!");
        }
      }
      while(i == 1);   
    }
  
  /**
  Computes the volume of the cylinder
  @param are radius of cylinder and height of cylinder
  @return Volume of cylinder
  */
   public static double volumeCylinder(double radiusOfCylinder, double heightOfCylinder)
   {
         Scanner in = new Scanner(System.in);
         System.out.println("What is the radius of the cylinder?");
         radiusOfCylinder = in.nextDouble();
         System.out.println("What is the height of the cylinder?");
         heightOfCylinder = in.nextDouble();
         System.out.println("Do you want the volume with or without the symbol PI? Type 1 for yes, 0 for no!");
         int i = in.nextInt();
         if(i == 0)
         {return Math.PI * radiusOfCylinder * radiusOfCylinder * heightOfCylinder;}
         else
         {return radiusOfCylinder * radiusOfCylinder * heightOfCylinder;}
   }
   /**
   Computes the volume of a sphere
   @param is the radius of the sphere
   @return is the volume of sphere
   */
   public static double volumeSphere(double radiusOfSphere)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("What is the radius of the sphere?");
      radiusOfSphere = in.nextDouble();
      System.out.println("Do you want the volume with or without the symbol PI? Type 1 for yes, 0 for no!");
      int i = in.nextInt();
      if(i == 0)
      {return (4/3) *  Math.PI * radiusOfSphere * radiusOfSphere * radiusOfSphere;} //Full calculation
      else
      {return radiusOfSphere * radiusOfSphere * radiusOfSphere * (4/3);}  
   } 
   /** 
   Computes the volume of a cone
   @param radius of the cone and height of the cone
   @return The volume of the conew
   */
   public static double  volumeCone(double radiusOfCone, double heightOfCone)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("What is the radius of the base of the cone?");
      radiusOfCone = in.nextDouble();
      System.out.println("What is the height of the cone?");
      heightOfCone = in.nextDouble();
      System.out.println("Do you want the volume with or without the symbol PI? Type 1 for yes, 0 for no!");
      int i = in.nextInt();
      if(i == 0)
      {return Math.PI * radiusOfCone * radiusOfCone * (heightOfCone / 3);}
      else
      {return radiusOfCone * radiusOfCone * (heightOfCone / 3);}
   }
   /**
   Computes the area of a triangle
   @param are base and height of triangle
   @return is area of the triangle
   */
   public static double areaTriangle(double baseOfTriangle, double heightOfTriangle)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("What is the base width of the triangle?");
      baseOfTriangle = in.nextDouble();
      System.out.println("What is the height of the triangle?");
      heightOfTriangle = in.nextDouble();
      return (1/2) * (baseOfTriangle * heightOfTriangle); 
   }
   /**
   Computes area of circle with radius given
   @param are radius of circle
   @return area of circle
   */
   public static double areaCircleR(double radiusOfCircle)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("What is the radius of the circle?");
      radiusOfCircle = in.nextDouble();
      System.out.println("Do you want the area to be given with or without pi calculated? Type 1 for yes or Type 0 for no!");
      int i = in.nextInt();
      if(i==0)
      {return radiusOfCircle * radiusOfCircle;}
      else if(i == 1)
      {return Math.PI * radiusOfCircle * radiusOfCircle;} 
      else
      {return 0;}
   }
   /**
   Computes Circumference of circle with radius
   @param is the radius of the circle
   @return is the circumference of the circle
   */
   public static double circumferenceCircleR(double radiusOfCircle)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("What is the radius of the circle?");
      radiusOfCircle = in.nextDouble();
      System.out.println("Do you want the circumeference to be given with or without pi calculated? Type 1 for yes or type 0 for no!");
      int i = in.nextInt();
      if(i == 0)
      {return 2 * radiusOfCircle;}
      else if(i == 1)
      {return Math.PI * 2 * radiusOfCircle;}
      else
      {return 0;}
   }
   /**
   Computes circumference of circle with user given diameter
   @param are diameter of circle
   @return is circumference of circle
   */
   public static double circumferenceCircleD(double diameterOfCircle)
   {
     Scanner in = new Scanner(System.in);
     System.out.println("What is the diameter of the circle?");
     diameterOfCircle = in.nextDouble();
     System.out.println("Do you want the circumference to be given with or without pi calculated? Type 1 for with or Type 0 for without!");
     int i = in.nextInt();
     if(i == 1)
     {return diameterOfCircle * 2 * Math.PI;}
     else if(i == 0)
     {return diameterOfCircle * 2;}
     else
     {return 0;}  
   }
   /**
   Computes of area of a trapezoid
   @param are height of trapezoid, short base of trapezoid, long base of trapezoid
   @return the area of the trapezoid
   */
   public static double areaTrapezoid(double heightOfTrapezoid, double shortHorizontalLine, double longHorizontalLine)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("What is height of the trapezoid?");
      heightOfTrapezoid = in.nextDouble();
      System.out.println("What is the top horizontal line length?");
      shortHorizontalLine = in.nextDouble();
      System.out.println("What is the bottom horizontal line length?");
      longHorizontalLine = in.nextDouble();
      return ((longHorizontalLine + shortHorizontalLine) / 2) * heightOfTrapezoid;
   }
   /**
   Computes the area of a parallelogram
   @param are base of the parallelogram and height of the parallelogram
   @return is the area of the parallelogram
   */
   public static double areaParallelogram(double baseOfParallelogram, double heightOfParallelogram)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("What is the base of the parallelogram?");
      baseOfParallelogram = in.nextDouble();
      System.out.println("What is the height of the parallelogram?");
      heightOfParallelogram = in.nextDouble();
      return baseOfParallelogram * heightOfParallelogram;
   }
 }
   
   
 
