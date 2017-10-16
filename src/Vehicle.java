public abstract class Vehicle implements VehicleInterface {

    String name;
    int speed;
    int distanceTraveled;

    public String getName(){ return this.name; }

    public int getDistanceTraveled(){ return this.distanceTraveled; }

    public void setSpeed(int speed){ this.speed = speed; }


}
