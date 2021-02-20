import java.util.Scanner;
/**
RECITATION 5: CODING ACTIVITY #1:
JAVA PROGRAM THAT TAKES IN INFORMATION BETWEEN TWO STUDENTS, AND THEN COMPARES
THERE INFORMATION. THIS PROGRAM WAS PRACTICE FOR CONSTRUCTORS, CLASSES
OBJECTS, INSTANCE VARIABLES, INSTANCE METHODS. FINISHED ON 2/17/2021 
*/

/**
 * This is the coding activity class that takes in student info and compares them.
 * @author mgebremariam7
 * @version 1.2
 */
public class CodeActRFive {
    /**
     * This is the main method that takes in and prints out student info.
     * @param args This is for the command line arguments 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your name, major, GTID, and year:");
        GTStudent student1 = new GTStudent(scan.nextLine(), scan.nextLine(), scan.nextInt(), scan.nextInt());
        System.out.println("Now just type in your name, then gtID:");
        scan.nextLine();
        String name2 = scan.nextLine();
        int gt2 = scan.nextInt();
        GTStudent student2 = new GTStudent(name2, gt2);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        student1.compareGT(student2);
    }
}

/**
 *This is the GTStudent class which is used for student instance data.
 * @author mgebremariam7
 * @version 1.1
 */
class GTStudent {
    private String name;
    private String major;
    private int gtID;
    private int year;

    public GTStudent() {
    }

    public GTStudent(String name, String major, int gtID, int year) {
        this.name = name;
        this.major = major;
        this.gtID = gtID;
        this.year = year;
    }

    public GTStudent(String name, int gtID) {
        this.name = name;
        this.gtID = gtID;
        this.major = "Computer Science";
        this.year = 1;
    }

    public GTStudent(GTStudent copyStudent) {
    }
    
    /**
     *Getter for name variable.
     * @return String representing name of student
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name variable.
     * @param name String representing name entered by user
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for major variable.
     * @return String representing the major of student
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * Setter for major variable.
     * @param major String representing a students major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Getter for gtID variable.
     * @return int representing the student gtID number
     */
    public int getGTID() {
        return this.gtID;
    }

    /**
     * Setter for the gtID variable.
     * @param gtID int representing the students gtID number
     */
    public void setGTID(int gtID) {
        this.gtID = gtID;
    }

    /**
     * Getter for year variable.
     * @return int representing the students year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Setter for year variable.
     * @param year int representing the students year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Method that returns all field data for an object as a string.
     * @return String formatted field data for object
     */
    public String toString() {
        return String.format("name, major, gtID, year: %s, %s, %d, %d", name,major,gtID,year);
    }

    /**
     * Method that takes in the two students and compares field data.
     * @param student2 Object: the second student instance
     */
    public void compareGT(GTStudent student2) {
        if ((this.name).equals(student2.name)) {
            System.out.println(this.name + " and " + student2.name
                                + " have the same name!");
        } else {
            System.out.println(this.name + " and " + student2.name
                                + " DO NOT have the same name!");
        }

        if ((this.major).equals(student2.getMajor())) {
            System.out.println(this.name + " and " + student2.name
                                + " have the same major -" + student2.major + "!");
        } else {
            System.out.println(this.name + " and " + student2.name
                                + " DO NOT have the same major " + this.major + "!");           
        }

        if (this.gtID == student2.gtID) {
            System.out.println(this.name + " and " + student2.name
                                + " have the same GTID!(Same student? X-files theme plays)");
        } else {
            System.out.println(this.name + " and " + student2.name
                                + " DO NOT have the same GTID!(that seems about right)");           
        }

        if (this.year == student2.year) {
            System.out.println(this.name + " and " + student2.name
                                + " have the same year!(theyre in this together!)");
        } else {
            System.out.println(this.name + " and " + student2.name
                                + " DO NOT have the same year!(sad day bois)");
        }
    }
}
