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

    public void setName(int number){ this.name = Integer.toString(number); }

    @Override
    public void moveForAnHour() { this.distanceTraveled = this.distanceTraveled + this.speed; }

    public void decreaseBreakDownTurnLeft(){ this.breakDownTurnLeft -= 1; }

    public void setBreakDownTurnLeft() {
        this.breakDownTurnLeft = breakDownTurn;
    }

    public int getBreakDownTurnLeft() { return breakDownTurnLeft; }

    //public void setSpeed(int speed) {this.speed = speed; }


    /*int speed, breakDownTurnLeft, distanceTraveled;
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

    public void decreaseBreakDownTurnLeft(){ this.breakDownTurnLeft -= 1; }

    public void setSpeed(){ this.speed = 100; }

    public void moveForAnHour(){ this.distanceTraveled = this.distanceTraveled + this.speed; }

    public int getDistanceTraveled(){
        return distanceTraveled;
    }*/
}
