/*
// speed: 100km/h. 5% chance of breaking down for 2 hours.
 // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
 breakdownTurnsLeft // holds how long its still broken down.
 distanceTraveled
 moveForAnHour()
 */

public class Truck {

    int speed, breakDownTurnLeft;
    String name;



    public void setName(int nameNumber){
        this.name = Integer.toString(nameNumber);
    }

    public String getName(){
        return this.name;
    }

    public void setBreakDownTurnLeft() {
        this.breakDownTurnLeft = 2;
    }

    public int getBreakDownTurnLeft(){
        this.breakDownTurnLeft -= 1;
        return getBreakDownTurnLeft();
    }

    public void setSpeed(){
        this.speed = 100;
    }
}
