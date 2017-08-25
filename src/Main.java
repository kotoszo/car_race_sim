/*
static isRaining //30% chance of rain every hour
 createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
 simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
 printRaceResults() // prints each vehicle's name, distance traveled ant type.

 Car: moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
 */


import java.util.Random;

public class Main {
    static boolean isRaining;

    public static void main(String[] args){

        Vehicles vehicles = new Vehicles();
        vehicles.createVehicles();
        simulateRace(vehicles);
        printResult(vehicles);
    }

    public static void simulateRace(Vehicles vehicles){
        Random randomChance = new Random();
        for (int hours = 0; hours < 50; hours++) {
            isRaining = randomChance.nextInt(100) <= 30;
            for (Car car: vehicles.carList) {
                if (isRaining){
                    car.setTooFast();
                } else {
                    car.setNormalSpeed(car.normalSpeed);
                    car.moveForAnHour();
                }
            }
            for (Motorcycle bike: vehicles.bikeList) {
                bike.setSpeed(isRaining);
                bike.moveForAnHour();
            }
            for (Truck truck: vehicles.truckList) {
                if (truck.breakDownTurnLeft > 0) {
                    truck.decreaseBreakDownTurnLeft();
                } else {
                    if (randomChance.nextInt(100) <= 5){
                        truck.setBreakDownTurnLeft();
                    } else {
                        truck.setSpeed();
                        truck.moveForAnHour();
                    }
                }
            }
        }
    }

    public static void printResult(Vehicles vehicles){
        for (Car car: vehicles.carList) {
            System.out.printf("Name %s      distance: %s\n", car.getName(), car.getDistanceTraveled());
        }
        System.out.println();

        for (Motorcycle bike: vehicles.bikeList) {
            System.out.printf("Name %s      distance: %s\n", bike.getName(), bike.getDistanceTraveled());
        }
        System.out.println();

        for (Truck truck: vehicles.truckList) {
            System.out.printf("Name %s      distance: %s\n", truck.getName(), truck.getDistanceTraveled());
        }
    }
}
