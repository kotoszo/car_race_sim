/*
 // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.

 static setSpeedLimit(int limit) // Call this from the Main class!

 normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
 name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
 distanceTraveled // holds the current distance traveled.
 moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
 */

public class Car {

    int speed, distanceTraveled, normalSpeed;
    String name;

    public void setNormalSpeed(int speed){ this.normalSpeed = speed; this.speed = speed; }

    public void setTooFast(){ this.speed = 70; }

    public void setName(String name){ this.name = name; }

    public String getName(){ return this.name; }

    public int getDistanceTraveled(){ return this.distanceTraveled; }

    public void moveForAnHour(){ this.distanceTraveled = this.distanceTraveled + this.speed; }
}
