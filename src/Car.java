/*
 // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.

 static setSpeedLimit(int limit) // Call this from the Main class!

 normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
 name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
 distanceTraveled // holds the current distance traveled.
 moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
 */

public class Car extends Vehicle{

    private int speedLimit;

    void setName(String name){ this.name = name; }

    @Override
    public void moveForAnHour() {
        if (Main.isRaining){
            this.distanceTraveled = this.distanceTraveled + speedLimit;
        } else {
            this.distanceTraveled = this.distanceTraveled + this.speed;
        }
    }

    void setSpeedLimit(int speedLimit) { this.speedLimit = speedLimit; }


}
