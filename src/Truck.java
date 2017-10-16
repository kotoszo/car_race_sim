/*
// speed: 100km/h. 5% chance of breaking down for 2 hours.
 // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
 breakdownTurnsLeft // holds how long its still broken down.
 distanceTraveled
 moveForAnHour()
 */

public class Truck extends Vehicle{

    private int breakDownTurnLeft;
    private final int breakDownTurn = 2;

    void setName(int number){ this.name = Integer.toString(number); }

    @Override
    public void moveForAnHour() { this.distanceTraveled = this.distanceTraveled + this.speed; }

    void decreaseBreakDownTurnLeft(){ this.breakDownTurnLeft -= 1; }

    void setBreakDownTurnLeft() { this.breakDownTurnLeft = breakDownTurn; }

    int getBreakDownTurnLeft() { return breakDownTurnLeft; }

}
