/*
// speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
 static nameNumber // The number of the instance created. Used for its name.
 name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
 distanceTraveled
 moveForAnHour()
 */

public class Motorcycle extends Vehicle {

    static int nameNumber;

    void setName(int Number){
        nameNumber = Number;
        this.name = "Motorcycle " + nameNumber;
    }

    public void setSpeed(int speedLimit){ this.speed = (Main.isRaining)? 100-speedLimit: 100; }

    public void moveForAnHour(){ this.distanceTraveled = this.distanceTraveled + this.speed; }

}
