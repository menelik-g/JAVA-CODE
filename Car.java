/**
 * We want to have instance data of: make, model, year, speed, hp, mpg
 * We want to have methods to: drive, break, turn
 *
 * Encapsulation: the object is responsible for it's own data
 * and should protect it from outsider's use.
 * --> We don't want outsiders to modify our instance data (without us knowing).
 * 
 * Some modifiers we should know: public, static, private, protected, final
 *
 * Modifiers for visibility: public, private, protected (don't worry about this one yet)
 *    public  - anyone (including outside the class) can see and change the field or call the method
 *    private - data/methods are only accessible (i.e. visible) withing the class
 */
public class Car {
    
    String model;
    String make;
    int year;
    double speed;
    int hp; 
    int mpg;
    int direction;
    
    // returns distance travelled
    public double drive(int timeInSeconds) {  
        System.out.printf("*** Calling Car's drive(%d)...\n",timeInSeconds); // DEBUG
        return speed * timeInSeconds;
    }
    
    // adjusts the speed, returns nothing
    public void brake(int timeInSeconds) {
        System.out.printf("*** Calling Car's brake(%d)...\n",timeInSeconds); // DEBUG
    }
    
    // changes direction, returns new angle
    public int turn(int degrees) {
        System.out.printf("*** Calling Car's turn(%d)...\n",degrees); // DEBUG
        return 0;
    }
    
    public String toString() {
        return String.format("{model,make,year,speed,hp,mpg,direction}={%s,%s,%d,%f,%d,%d,%d}",
            model,make,year,speed,hp,mpg,direction);
    }
    
    // Setter (Mutator) for Car's speed
    public void setSpeed(double speed) {
        System.out.printf("*** Calling Car's setSpeed(%f)...\n",speed); // DEBUG
        this.speed = speed;
    }
    
    // Getter (Accessor) for Car's speed
    public double getSpeed() {
        System.out.printf("*** Calling Car's getSpeed()...\n"); // DEBUG
        return speed;
    }
  
    public static void main(String[] args) {
        Car c1 = new Car();
        double distance = c1.drive(10);
        System.out.println("*** c1: " + c1.toString()); // DEBUG
        c1.brake(5);
        int direction = c1.turn(180);
        System.out.println("*** c1: " + c1.toString()); // DEBUG 
        System.out.println("*** c1.getSpeed(): " + c1.getSpeed()); // DEBUG
        c1.setSpeed(88.0);
        System.out.println("*** c1: " + c1.toString()); // DEBUG
        System.out.println("*** c1.getSpeed(): " + c1.getSpeed()); // DEBUG
    }
}
