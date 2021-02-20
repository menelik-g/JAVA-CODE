/*
MENELIK GEBREMARIAM LAST EDITED ON: 02/07/2021
ROULETTE GAME USING THE TOPICS OF: RANDOM CLASS, MATH, ENUMS, AND PACKAGES
GAME BASED ON MARIO PARTY MINIGAME "DAY AT THE RACES", PICK ONE OF 3 DIFFICULTIES
AND ONE OF 3 RACERS AND RACE OFF! RANDOM VARIABLES ARE USED TO SEE WHETHER OR NOT
YOU WON THE RACE OR NOT. THIS CALCULATION IS DIFFERENT BASED ON WHAT
DIFFICULITY THE PLAYER HAS CHOSEN. YOU'RE DOING WELL, DON'T GIVE UP!!!
*/

import java.util.Scanner;
public class Roulette {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentinel = "y"; // sentinel value for do-while loop
        String diffchoice; // string for user to assign to their difficulty choice
        String racer; // stores the string of the name of the racer the user chooses
        do {
            RoulMethods.displayIntro(); //calls to the intro method to print out the intro header
            diffchoice = scan.nextLine().toUpperCase(); //asks user to enter in choice of difficulty, uppercases it
            System.out.print("Now choose your racer! (King Boo, Thwomp, or Bob-omb): ");
            racer = scan.nextLine().toUpperCase(); // asks user to enter in choice of racer, uppercases it
            RoulMethods.difficultyPointer(diffchoice, racer); //calls the difficultyPointer method in RoulMethods class
            System.out.println();
            System.out.print("Do you want to bet in the race again? (Y/N): ");
            sentinel = scan.nextLine();
        } while (sentinel.equalsIgnoreCase("y"));
        RoulMethods.displayOutro();
    }
}
// Check RoulMethods for all of the static methods called for