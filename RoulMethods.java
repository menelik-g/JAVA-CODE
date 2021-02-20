import java.util.Random;
public class RoulMethods {
    public enum Difficulty {
        EASY,
        MEDIUM,
        HARD;
    }
    public static void main(String[] args) {

    }
    /*method that displays intro text for the roulette game*/
    public static void displayIntro() {
        System.out.println("*********************************************************"
            + "******************************************************************");
        System.out.println("******************                             WELCOME TO"
            + " CHANCE TIME!                               **********************");
        System.out.println("************************************************************"
            + "***************************************************************");
        System.out.println("INSTRUCTIONS: Welcome! The rules are simple CHANCE TIME! "
            + "First, you will enter in one of 3 difficulties (Easy, Medium, Hard)");
        System.out.println("Once you do that, you will then be asked to bet on one of "
            + "the 3 characters in a race (King Boo, Thwomp, and Bob-omb). Once ");
        System.out.println("you do that, the race will be completed and you will be told"
            + " whether or not you made good on your bet! Easy right? Okay Good!");
        System.out.print("Now enter in your difficulty choice (Easy, Medium, Hard): ");
    }
    /*method that takes in the difficulty and racer choice and then redirects it to another method for calculations*/
    public static void difficultyPointer(String diffchoice, String racer) {
        Difficulty easy = Difficulty.EASY;
        Difficulty medium = Difficulty.MEDIUM;
        Difficulty hard = Difficulty.HARD;
        // makes calls to the enum for the difficulties
        if (diffchoice.equalsIgnoreCase(easy.name())) {
            doEasy(racer);
        } else if (diffchoice.equalsIgnoreCase(medium.name())) {
            doMedium(racer);
        } else if (diffchoice.equalsIgnoreCase(hard.name())) {
            doHard(racer);
        }
    }
    /*method that does calculations if difficulty choice is easy*/
    public static void doEasy(String racer) {
        Random rand = new Random();
        int val = (int) Math.round(rand.nextDouble() * (100));
        if (val >= 0 && val < 65) {
            winnerResult(racer);
        } else if (val >= 65 && val < 95) {
            loserResult(racer);
        } else if (val >= 95 && val <= 100) {
            drawResult(racer);
        }
    }
    /*method that does calculations if difficulty choice is medium*/
    public static void doMedium(String racer) {
        Random rand = new Random();
        int val = (int) Math.round(rand.nextDouble() * 100);
        if (val >= 0 && val < 55) {
            winnerResult(racer);
        } else if (val >= 55 && val < 95) {
            loserResult(racer);
        } else if (val >= 95 && val <= 100) {
            drawResult(racer);
        }
    }
    /*method that does calculations if difficulty choice is hard*/
    public static void doHard(String racer) {
        Random rand = new Random();
        int val = (int) Math.round(rand.nextDouble() * 100);
        if (val >= 0 && val < 45) {
            winnerResult(racer);
        } else if (val >= 45 && val < 95) {
            loserResult(racer);
        } else if (val >= 95 && val <= 100) {
            drawResult(racer);
        }
    }
    /*method that displays result if the user won the race*/
    public static void winnerResult(String racer) {
        System.out.println("*********************************************************");
        System.out.println("***********    CONGRATS! YOU WON THE RACE!    ***********");
        System.out.println("*********************************************************");
        System.out.println("You and " + racer + " have won the race! Good Job winning!");
        System.out.printf("The money you won in the race: $%,8.2f%n", (double) (Math.random() * 10000));
        System.out.println();
    }
    /*method that displays result if the user lost the race*/
    public static void loserResult(String racer) {
        System.out.println("***********************************************************");
        System.out.println("************    OOF MAN! YOU LOST THE RACE!    ************");
        System.out.println("***********************************************************");
        System.out.println("Oof, You and " + racer + " have lost the race! Sad day man.");
        System.out.printf("The money you lost in the race: $-%,8.2f%n", (double) (Math.random() * 10000));
        System.out.println();
    }
    /*method that displays result if the user tied the race*/
    public static void drawResult(String racer) {
        System.out.println("********************************************************************");
        System.out.println("***************    YOU.....TIED IN THE RACE???    ******************");
        System.out.println("********************************************************************");
        System.out.println("You and " + racer + " have tied the race! That almost never happens!");
        System.out.println(" You made no money in this race, but you didn't lose either! :D");
        System.out.println();
    }
    /*method that displays a goodbye message if the user doesn't want to use the program again*/
    public static void displayOutro() {
        System.out.println("***********************************************************"
            + "****************************************************************");
        System.out.println("******************                          BYE-BYE NOW, "
            + "COME BACK SOON!                             **********************");
        System.out.println("************************************************************"
            + "***************************************************************");
    }
}