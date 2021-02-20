import java.util.Scanner;
/**
RECITATION 5: CODING ACTIVITY #2
WRITING A JAVA PROGRAM ABOUT SANDWICHES, WITH CLASSES, OBJECTS
ARRAYS, AND METHODS!!!
FINISHED ON 02/17/2021 YOU GOT THIS, DONT GIVE UP~!
*/

/** 
 * This the sandwich class that creates your sandwich, yum.
 * @author mgebremariam7
 * @version 1.1
 */
public class SandwichMaker {
    static String[] sandwich = new String[10];
    static String[] kitchen = {"Peanut Butter", "Ham", 
                            "Swiss Cheese", "Hot Sauce",
                            "Frosted Flakes", "Hot Dog Bun",
                            "Chicken Tender", "Turkey",
                            "Jelly", "Steak Sauce"};

    /**
     * Method that creates a sandwich from the items in the kitchen.
     * @param request String array representing what the user wants
     * @param kitchen String array representing whats available
     */
    public static void createSandwich(String[] request, String[] kitchen) {
        int count = 0;
        for (int j = 0; j < request.length; j++){
            boolean isItThere = false;
            for (int i = 0; i < kitchen.length; i++) {
                if(request[j].equals(kitchen[i])) {
                    sandwich[count] = request[j]; 
                    count++;
                    isItThere = true;
                }
            }
            if (isItThere == false) {
                System.out.printf("Oops, I don't have %s.%n", request[j]);
            }
        }
    }

    /**
     * Main method that asks user to create a sandwich.
     * @param args Array for Command Line Arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] request = new String[3];
        for (int i = 0; i < request.length; i++) {
            System.out.printf("Type in an item you want on your sandwich(%d items left): ", (3 - i));
            request[i] = scan.nextLine();
        }
        createSandwich(request, kitchen);
        System.out.print("Your ");
        for (int i = 0; i < sandwich.length; i++) {
            if (sandwich[i] != null) {
                System.out.printf("%s ", sandwich[i]);
            }
        }
        System.out.println("sandwich is complete!");
    }
}