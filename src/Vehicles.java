public class Vehicles {

    Car[] carList;
    Motorcycle[] bikeList;
    Truck[] truckList;

    public void createVehicles(){
        Cars();
        Motorcycles();
        Trucks();
    }

    // should it be, setCars? and with getCars reach the carList?

    private void Cars(){
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car();
        Car car10 = new Car();
        Car[] carList = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
        this.carList = carList;
    }

    private void Motorcycles(){
        Motorcycle bike1 = new Motorcycle();
        Motorcycle bike2 = new Motorcycle();
        Motorcycle bike3 = new Motorcycle();
        Motorcycle bike4 = new Motorcycle();
        Motorcycle bike5 = new Motorcycle();
        Motorcycle bike6 = new Motorcycle();
        Motorcycle bike7 = new Motorcycle();
        Motorcycle bike8 = new Motorcycle();
        Motorcycle bike9 = new Motorcycle();
        Motorcycle bike10 = new Motorcycle();
        Motorcycle[] bikeList = new Motorcycle[]{bike1, bike2, bike3, bike4, bike5, bike6, bike7, bike8, bike9, bike10};
        this.bikeList = bikeList;
    }

    private void Trucks(){
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        Truck truck4 = new Truck();
        Truck truck5 = new Truck();
        Truck truck6 = new Truck();
        Truck truck7 = new Truck();
        Truck truck8 = new Truck();
        Truck truck9 = new Truck();
        Truck truck10 = new Truck();
        Truck[] truckList = new Truck[]{truck1, truck2, truck3, truck4, truck5, truck6, truck7, truck8, truck9, truck10};
        this.truckList = truckList;
    }

}
