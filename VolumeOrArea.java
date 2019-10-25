/** 
This program allows you to both calculate volume and area for any shape(WIP)
Gives both full calculation and calculation with Pi
Menelik Gebremariam 10/16/19
Update added a while loop so the calculator can be used multiple times! Nice!
Menelik Gebremariam 10/23/19
*/
import javax.swing.JOptionPane;
import java.util.Scanner;
public class VolumeOrArea
{
   public static void main(String[] args)
   {
   Scanner in = new Scanner(System.in);
   String pie = "pi";
   String volume = "Volume";
   String area = "Area";
   System.out.println("Do you want Volume or Area?");
   String answer1 = in.next();
   if (volume.equals(answer1))    //If user picks Volume option
   {
      String cylinder = "Cylinder";
      String cube = "Cube";
      String sphere = "Sphere";
      String cone = "Cone";
      System.out.println("What shape do you want the Volume for?");
      String answerA1 = in.next();
      if (cylinder.equals(answerA1))  //If the user picks volume of cylinder
        {
         System.out.println("What is the radius of the cylinder?");
         double radiusOfCylinder = in.nextDouble();
         System.out.println("What is the height of the cylinder?");
         double heightOfCylinder = in.nextDouble();
         double volumeOfCylinder = Math.PI * radiusOfCylinder * radiusOfCylinder * heightOfCylinder;
         double volumeOfCylinderPi = (radiusOfCylinder * radiusOfCylinder * heightOfCylinder);
         System.out.printf("Volune of Cylinder is: %.2f\n", volumeOfCylinder);    //Full Calculation
         System.out.println("Volume with Pi is: " + volumeOfCylinderPi + "pi");  //Calculation with Pi
        }
      else if (cube.equals(answerA1)) //If user picks volume of cube
         {
            System.out.println("What is the size of one of the sides of the cube?");
            double sideOfCube = in.nextDouble();
            double volumeOfCube = Math.pow(sideOfCube, 3); 
            System.out.printf("Volune of Cube is: %.2f\n", volumeOfCube);    //Full calculation
         }
      else if (sphere.equals(answerA1)) // If user picks volume of sphere
          {
            System.out.println("What is the radius of the sphere?");
            double radiusOfSphere = in.nextDouble();
            double volumeOfSphere = (4/3) *  Math.PI * radiusOfSphere * radiusOfSphere * radiusOfSphere;
            double volumeOfSpherePi = radiusOfSphere * radiusOfSphere * radiusOfSphere * (4/3);
            System.out.printf("Volume of Sphere is: %.2f\n", volumeOfSphere);     //Full calculation
            System.out.println("Volume with Pi is: " + volumeOfSpherePi + "pi"); //Calculation with Pi
          }
      else if (cone.equals(answerA1))   //If user picks volume of cone
          {
            System.out.println("What is the radius of the base of the cone?");
            double radiusOfCone = in.nextDouble();
            System.out.println("What is the height of the cone?");
            double heightOfCone = in.nextDouble();
            double volumeOfCone = Math.PI * radiusOfCone * radiusOfCone * (heightOfCone / 3);
            double volumeOfConePi = radiusOfCone * radiusOfCone * (heightOfCone / 3);
            System.out.printf("Volume of the cone: %.2f\n" + volumeOfCone);    //Full calculation
            System.out.printf("Volume of cone with Pi: %.2f\n" + volumeOfConePi + "pi");    //Calculation with Pi
          }
        else {System.out.println("Can't find the volume of this shape! Try again!");}  
     }
      else if (area.equals(answer1))     //If user wants Area of a shape!
           {
            String square = "Square";
            String triangle = "Triangle";
            String circle = "Circle";
            String trapezoid = "Trapezoid";
            String parallelogram = "Parallelogram";
            System.out.println("What shape do you want the area of?");
            String answerA2 = in.next();
         if (square.equals(answerA2))    //If user wants area of square
           {
            System.out.println("What is the size of one of the sides?");
            double sideOfSquare = in.nextDouble();
            double areaOfSquare = sideOfSquare * sideOfSquare;
            System.out.printf("The area of the square is: %.2f\n", areaOfSquare);
           }
         if (triangle.equals(answerA2))
           {
            System.out.println("What is the base width of the triangle?");
            double baseOfTriangle = in.nextDouble();
            System.out.println("What is the height of the triangle?");
            double heightOfTriangle = in.nextDouble();
            double areaOfTriangle = (1/2) * (baseOfTriangle * heightOfTriangle);
            System.out.printf("The area of the triangle is: %.2f\n", areaOfTriangle);
           }
         if (circle.equals(answerA2))  // The user wants area of circumference of Circle
           {
            String circumferenceCircle = "Circumference";
            String areaCircle = "Area of Circle";
            String radius = "Radius";
            String diameter = "Diameter";
            System.out.println("Circumference or Area of Circle?");
            String circumferenceOrArea = in.next();
            if (areaCircle.equals(circumferenceOrArea))              
            {
                System.out.println("What is the radius of the circle?");
                double radiusOfCircle = in.nextDouble();
                double areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
                double areaOfCirclePi = radiusOfCircle * radiusOfCircle;
                System.out.printf("The area of the circle is: %.2f\n", areaOfCircle);
            }
            else if (circumferenceCircle.equals(circumferenceOrArea))    //If user wants to find circumference of a circle
                {
                 String circumference = "Circumference";
                 System.out.println("Radius or Diameter?");
                 String radiusOrDiameter = in.next();
                 if(radius.equals(radiusOrDiameter))     //If radius is being used to find circumference
                     {
                      System.out.println("What is the radius of the circle?");
                      double radiusOfCircle = in.nextDouble();
                      double circumferenceOfCircle = Math.PI * 2 * radiusOfCircle;
                      double circumferenceOfCirclePi = 2 * radiusOfCircle;
                      System.out.printf("The circumference of the circle is: %.2f\n", circumferenceOfCircle);    
                     }
                 else if (diameter.equals(radiusOrDiameter))
                    {
                     System.out.println("What is the diameter of the circle?");
                     double diameterOfCircle = in.nextDouble();
                     double circumferenceOfCircle = diameterOfCircle * Math.PI; 
                     System.out.printf("The circumference of the circle is: %.2f\n", circumferenceOfCircle);
                    }
           if (trapezoid.equals(answerA2)) //If user wants area of trapezoid
             {
               System.out.println("What is height of the trapezoid?");
               double heightOfTrapezoid = in.nextDouble();
               System.out.println("What is the top horizontal line length?");
               double topHorizontalLine = in.nextDouble();
               System.out.println("What is the bottom horizontal line length?");
               double bottomHoriztonalLine = in.nextDouble();
               double areaOfTrapezoid = ((topHorizontalLine + bottomHoriztonalLine) / (2)) * heightOfTrapezoid;
               System.out.printf("The area of the trapezoid is: %.2f\n", areaOfTrapezoid);
             } 
           if (parallelogram.equals(answerA2))  //If user wants area of parallelogram
             {
               System.out.println("What is the base of the parallelogram?");
               double baseOfParallelogram = in.nextDouble();
               System.out.println("What is the height of the parallelogram?");
               double heightOfParallelogram = in.nextDouble();
               double areaOfParallelogram = baseOfParallelogram * heightOfParallelogram;
               System.out.printf("The area of the parallelogram is: %.2f\n", areaOfParallelogram);
             }      
                
            }     
         }
       else {System.out.println("Can't find the area of this shape! Try again!");} 
       }  
 int i = 1;
 while (i > 0)
  {
      System.out.println("Would you like to use the calculator again?");
      String response = in.next();
   if (response.equals("yes") || response.equals("Yes"))
   { 
      System.out.println("Do you want Volume or Area?");
      answer1 = in.next();
      if (volume.equals(answer1))    //If user picks Volume option
       {
         String cylinder = "Cylinder";
         String cube = "Cube";
         String sphere = "Sphere";
         String cone = "Cone";
         System.out.println("What shape do you want the Volume for?");
         String answerA1 = in.next();
      if (cylinder.equals(answerA1))  //If the user picks volume of cylinder
        {
         System.out.println("What is the radius of the cylinder?");
         double radiusOfCylinder = in.nextDouble();
         System.out.println("What is the height of the cylinder?");
         double heightOfCylinder = in.nextDouble();
         double volumeOfCylinder = Math.PI * radiusOfCylinder * radiusOfCylinder * heightOfCylinder;
         double volumeOfCylinderPi = (radiusOfCylinder * radiusOfCylinder * heightOfCylinder);
         System.out.printf("Volune of Cylinder is: %.2f\n", volumeOfCylinder);    //Full Calculation
         System.out.println("Volume with Pi is: " + volumeOfCylinderPi + "pi");  //Calculation with Pi
        }
      else if (cube.equals(answerA1)) //If user picks volume of cube
         {
            System.out.println("What is the size of one of the sides of the cube?");
            double sideOfCube = in.nextDouble();
            double volumeOfCube = Math.pow(sideOfCube, 3); 
            System.out.printf("Volune of Cube is: %.2f\n", volumeOfCube);    //Full calculation
         }
      else if (sphere.equals(answerA1)) // If user picks volume of sphere
          {
            System.out.println("What is the radius of the sphere?");
            double radiusOfSphere = in.nextDouble();
            double volumeOfSphere = (4/3) *  Math.PI * radiusOfSphere * radiusOfSphere * radiusOfSphere;
            double volumeOfSpherePi = radiusOfSphere * radiusOfSphere * radiusOfSphere * (4/3);
            System.out.printf("Volume of Sphere is: %.2f\n", volumeOfSphere);     //Full calculation
            System.out.println("Volume with Pi is: " + volumeOfSpherePi + "pi"); //Calculation with Pi
          }
      else if (cone.equals(answerA1))   //If user picks volume of cone
          {
            System.out.println("What is the radius of the base of the cone?");
            double radiusOfCone = in.nextDouble();
            System.out.println("What is the height of the cone?");
            double heightOfCone = in.nextDouble();
            double volumeOfCone = Math.PI * radiusOfCone * radiusOfCone * (heightOfCone / 3);
            double volumeOfConePi = radiusOfCone * radiusOfCone * (heightOfCone / 3);
            System.out.printf("Volume of the cone: %.2f\n" + volumeOfCone);    //Full calculation
            System.out.printf("Volume of cone with Pi: %.2f\n" + volumeOfConePi + "pi");    //Calculation with Pi
          }  
      }
      else if (area.equals(answer1))     //If user wants Area of a shape!
           {
             String square = "Square";
             String triangle = "Triangle";
             String circle = "Circle";
             String trapezoid = "Trapezoid";
             String parallelogram = "Parallelogram";
             System.out.println("What shape do you want the area of?");
             String answerA2 = in.next();
         if (square.equals(answerA2))    //If user wants area of square
           {
            System.out.println("What is the size of one of the sides?");
            double sideOfSquare = in.nextDouble();
            double areaOfSquare = sideOfSquare * sideOfSquare;
            System.out.printf("The area of the square is: %.2f\n", areaOfSquare);
           }
         if (triangle.equals(answerA2))
           {
            System.out.println("What is the base width of the triangle?");
            double baseOfTriangle = in.nextDouble();
            System.out.println("What is the height of the triangle?");
            double heightOfTriangle = in.nextDouble();
            double areaOfTriangle = (1/2) * (baseOfTriangle * heightOfTriangle);
            System.out.printf("The area of the triangle is: %.2f\n", areaOfTriangle);
           }
         if (circle.equals(answerA2))  // The user wants area of circumference of Circle
           {
            String circumferenceCircle = "Circumference";
            String areaCircle = "Area of Circle";
            String radius = "Radius";
            String diameter = "Diameter";
            System.out.println("Circumference or Area of Circle?");
            String circumferenceOrArea = in.next();
            if (areaCircle.equals(circumferenceOrArea))              
            {
                System.out.println("What is the radius of the circle?");
                double radiusOfCircle = in.nextDouble();
                double areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
                double areaOfCirclePi = radiusOfCircle * radiusOfCircle;
                System.out.printf("The area of the circle is: %.2f\n", areaOfCircle);
            }
            else if (circumferenceCircle.equals(circumferenceOrArea))    //If user wants to find circumference of a circle
                {
                 String circumference = "Circumference";
                 System.out.println("Radius or Diameter?");
                 String radiusOrDiameter = in.next();
                 if(radius.equals(radiusOrDiameter))     //If radius is being used to find circumference
                     {
                      System.out.println("What is the radius of the circle?");
                      double radiusOfCircle = in.nextDouble();
                      double circumferenceOfCircle = Math.PI * 2 * radiusOfCircle;
                      double circumferenceOfCirclePi = 2 * radiusOfCircle;
                      System.out.printf("The circumference of the circle is: %.2f\n", circumferenceOfCircle);    
                     }
                 else if (diameter.equals(radiusOrDiameter))
                    {
                     System.out.println("What is the diameter of the circle?");
                     double diameterOfCircle = in.nextDouble();
                     double circumferenceOfCircle = diameterOfCircle * Math.PI; 
                     System.out.printf("The circumference of the circle is: %.2f\n", circumferenceOfCircle);
                    }
           if (trapezoid.equals(answerA2)) //If user wants area of trapezoid
             {
               System.out.println("What is height of the trapezoid?");
               double heightOfTrapezoid = in.nextDouble();
               System.out.println("What is the top horizontal line length?");
               double topHorizontalLine = in.nextDouble();
               System.out.println("What is the bottom horizontal line length?");
               double bottomHoriztonalLine = in.nextDouble();
               double areaOfTrapezoid = ((topHorizontalLine + bottomHoriztonalLine) / (2)) * heightOfTrapezoid;
               System.out.printf("The area of the trapezoid is: %.2f\n", areaOfTrapezoid);
             } 
           if (parallelogram.equals(answerA2))  //If user wants area of parallelogram
             {
               System.out.println("What is the base of the parallelogram?");
               double baseOfParallelogram = in.nextDouble();
               System.out.println("What is the height of the parallelogram?");
               double heightOfParallelogram = in.nextDouble();
               double areaOfParallelogram = baseOfParallelogram * heightOfParallelogram;
               System.out.printf("The area of the parallelogram is: %.2f\n", areaOfParallelogram);
             }      
                
            }     
         }
       }
      }
      else {System.out.println("Bye-bye!");}
            
         
     }
   }

}