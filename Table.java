import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        TableMethods.argsPrinter(args);
        String[] argsB = TableMethods.argsPrinterReverse(args);
        System.out.println();
        System.out.println();
        System.out.println(argsB);
        System.out.println(args);
        System.out.println();
        int[][] table = TableMethods.randomTable();
        System.out.println(table);
        System.out.println("Random number from the table: " + TableMethods.grabRandomNumber(table));
        String[][] words = TableMethods.wordTable();
        System.out.println(words);
        TableMethods.printString2D(words);
        TableMethods.printRaggedPoint(table);
    }
}