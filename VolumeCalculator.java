/** 
Making Area and Volume Calculator with Option windows, Grrreat! 10/12/19
*/

import java.util.Scanner;
import javax.swing.JOptionPane;
public class VolumeCalculator
  {
   public static void main(String[] args)
    {
     String cylinder = "Cylinder";
     String cube = "Cube";
     String sphere = "Sphere";
     String cone = "Cone";
     String all = "All";
     Scanner in = new Scanner(System.in);
     System.out.println("What shape do you need the volume for?");
     String input1 = in.next();
     if (cylinder.equals(input1))
       {
         System.out.println("What is the radius of the cylinder?");
         double r1 = in.nextDouble();
         System.out.println("Height?");
         double h1 = in.nextDouble();
         double volumeOfCylinder = Math.PI * r1 * r1 * h1;
         System.out.println("Volume of Cylinder is: ");
         System.out.printf("%.2f", volumeOfCylinder);
       }
     if (cube.equals(input1))
       {
         System.out.println("Size of one of the sides?");
         double s1 = in.nextDouble();
         double volumeOfCube = s1 * s1 * s1;
         System.out.println("Volume of Cube is: ");
         System.out.printf("%.2f", volumeOfCube);
       }
     if (sphere.equals(input1))
       {
         System.out.println("What is the radius of the sphere?");
         double r2 = in.nextDouble();
         double volumeOfSphere = (4/3) * Math.PI * r2 * r2 * r2;
         System.out.println("The volume of sphere is: ");
         System.out.printf("%.2f", volumeOfSphere);
       }
     if (cone.equals(input1))
       {
       System.out.println("What is the radius of the cone?");
       double r3 = in.nextDouble();
       System.out.println("What is the height of the cone?");
       double h2 = in.nextDouble();
       double volumeOfCone = (Math.PI * r3 * r3 * h2) / 3;
       System.out.println("The volume of the cone is: ");
       System.out.printf("%.2f", volumeOfCone);
       }
     if (all.equals(input1))
       {
         System.out.println("This option lets you try out all the shapes this calculator does which is only 4 right now!");
         System.out.println("What is the radius of the cylinder?");
         double r1 = in.nextDouble();
         System.out.println("Height?");
         double h1 = in.nextDouble();
         double volumeOfCylinder = Math.PI * r1 * r1 * h1;
         System.out.println("Volume of Cylinder is: ");
         System.out.printf("%.2f", volumeOfCylinder);
         System.out.println("Size of one of the sides?");
         double s1 = in.nextDouble();
         double volumeOfCube = s1 * s1 * s1;
         System.out.println("Volume of Cube is: ");
         System.out.printf("%.2f", volumeOfCube);
         System.out.println("What is the radius of the sphere?");
         double r2 = in.nextDouble();
         double volumeOfSphere = (4/3) * Math.PI * r2 * r2 * r2;
         System.out.println("The volume of sphere is: ");
         System.out.printf("%.2f", volumeOfSphere);
         System.out.println("What is the radius of the cone?");
         double r3 = in.nextDouble();
         System.out.println("What is the height of the cone?");
         double h2 = in.nextDouble();
         double volumeOfCone = (Math.PI * r3 * r3 * h2) / 3;
         System.out.println("The volume of the cone is: ");
         System.out.printf("%.2f", volumeOfCone);
     
       }
         else
         {
              System.out.print("Sowwy, I cant do that one yet!");
         }

      

   
   
    }
   
  }