import java.util.Scanner;
/**
 * This is the CoffeeShop Class.
 * @author mgebremariam7
 * @version 1.0
 */
public class CoffeeShop {
    /**
     * The main method that creates and prints out the order!
     * @param args takes in command line arguments
     */
    public static void main(String[] args) {
        Order latte = Order.LATTE;
        Order coffee = Order.COFFEE;
        Order icedCoffee = Order.ICED_COFFEE;
        Order frappe = Order.FRAPPE;
        Order pastry = Order.PASTRY;
        System.out.println("Welcome to your local coffee shop! What does the rush look like today?");
        Scanner scan = new Scanner(System.in);
        Order[] array = createOrderArray(scan.nextLine());
        computeOrderMakeTime(array, 1);
        computeOrderMakeTime(array, 2);
        computeOrderMakeTime(array, 3);
    }

    /**
     * Method for creating the order.
     * @param customerOrder String representing the customers order
     * @return Array representing the order
     */
    public static Order[] createOrderArray(String customerOrder) {
        Order latte = Order.LATTE;
        Order coffee = Order.COFFEE;
        Order icedCoffee = Order.ICED_COFFEE;
        Order frappe = Order.FRAPPE;
        Order pastry = Order.PASTRY;
        Order[] orders = new Order[customerOrder.length()];
        for (int i = 0; i < customerOrder.length(); i++) {
            switch (customerOrder.charAt(i)) {
            case 'L':
                orders[i] = latte;
                break;
            case 'C':
                orders[i] = coffee;
                break;
            case 'I':
                orders[i] = icedCoffee;
                break;
            case 'F':
                orders[i] = frappe;
                break;
            case 'P':
                orders[i] = pastry;
                break;
            default:
                break;
            }
        }
        return orders;
    }
    /**
     * Method used for getting order make time.
     * @param val Order value representing one item on the order
     * @return double value that is the time it takes to make the item
     */
    public static double lookupMakeTime(Order val) {
        double time = 0;
        switch (val) {
        case LATTE:
            time = 3.0;
            break;
        case COFFEE:
            time = 0.5;
            break;
        case ICED_COFFEE:
            time = 2.0;
            break;
        case FRAPPE:
            time = 6.0;
            break;
        case PASTRY:
            time = 3.0;
            break;
        default:
            break;
        }
        return time;
    }

    /**
     * Method that prints out the completed order.
     * @param array Array that contains the customers order
     * @param numBaristas Integer that contains the number of baristas
     */
    public static void computeOrderMakeTime(Order[] array, int numBaristas) {
        int numOrders = array.length;
        double totalMakeTime = 0;
        for (int i = 0; i < array.length; i++) {
            totalMakeTime += lookupMakeTime(array[i]);
        }
        double time = (totalMakeTime / numBaristas) + (numOrders % numBaristas);
        System.out.println("It will take " + time + " minutes for "
                        + numBaristas + " baristas to make these orders.");

    }
}