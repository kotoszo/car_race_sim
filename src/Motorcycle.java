/*
// speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
 static nameNumber // The number of the instance created. Used for its name.
 name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
 distanceTraveled
 moveForAnHour()
 */

public class Motorcycle {

    int speed, distanceTraveled;
    static int nameNumber;
    String name;

    public void setName(int Number){
        nameNumber = Number;
        this.name = "Motorcycle " + nameNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getDistanceTraveled(){
        return distanceTraveled;
    }

    public void setSpeed(boolean isRaining){ this.speed = (isRaining)? 0: 100; }

    public void moveForAnHour(){ this.distanceTraveled = this.distanceTraveled + this.speed; }

}
