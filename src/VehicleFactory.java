class VehicleFactory {

    private static int howManyVehicle;
    private static Vehicles factory = Vehicles.getInstance();

    public static void howManyVehicle(int howMany) {
        howManyVehicle = howMany;
    }

    static void getAll(){
        getCars();
        getBikes();
        getTrucks();
    }

    static void getCars(){
        factory.initCars(howManyVehicle);
        factory.setCars(howManyVehicle);
    }

    static void getBikes() {
        factory.initMotorcycles(howManyVehicle);
        factory.setMotorcycles();
    }

    static void getTrucks(){
        factory.initTrucks(howManyVehicle);
        factory.setTrucks();
    }
}
