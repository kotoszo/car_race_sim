import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Vehicles {

    Car[] carList;
    Motorcycle[] bikeList;
    Truck[] truckList;
    Random random;

    public void createVehicles(){
        this.random = new Random();
        initCars();
        setCars();

        initMotorcycles();
        setMotorcycles();

        initTrucks();
        setTrucks();
    }

    private void initCars(){
        Car[] carList = new Car[10];
        for (int i = 0; i < 10; i++) {
            carList[i] = new Car();
        }
        this.carList = carList;
    }

        private void setCars(){
            HashSet<Integer> indexes = new HashSet<>();
            String[] carsFirstName = new String[] {"Crest", "Blade", "Specter", "Conqueror", "Freedom", "Dominion",
                    "Majesty", "Vision", "Renegade", "Origin", "Eminance", "Motive", "Eon", "Tigress", "Twister",
                    "Legend", "Alabaster", "Realm", "Expedition", "Ranger", "Patron", "Momentum", "Deputy", "Mastery",
                    "Paradox", "Vagabond", "Shadow", "Inquiry", "Inferno"};
            String[] carsSecondName = new String[] {"Oracle", "Supremacy", "Thriller", "Viper", "Formula", "Vindicator",
                    "Mastery", "Augury", "Ferocity", "Silver", "Freedom", "Barrage", "Triumph", "Freedom", "Meridian",
                    "Paladin", "Capital", "Passion", "Vortex", "Intro", "Obsidian", "Fragment", "Albatross", "Encounter",
                    "Twister", "Freedom", "Bolt", "Phenomenom", "Escape", "Renegade"};

            do {
                int index = random.nextInt(carsFirstName.length-1);
                indexes.add(index);
            } while(indexes.size() < 10);

            Iterator<Integer> it = indexes.iterator();

            for (Car car: carList) {
                int nameIndex = it.next();
                String fullName = carsFirstName[nameIndex] + carsSecondName[nameIndex];
                car.setNormalSpeed(random.nextInt(110-80)+80);
                car.setName(fullName);
        }
    }

    private void initMotorcycles(){
        Motorcycle[] bikeList = new Motorcycle[10];
        for (int i = 0; i < 10; i++) {
            bikeList[i] = new Motorcycle();
        }
        this.bikeList = bikeList;
    }

    private void setMotorcycles(){
        int Nr = 1;
        for (Motorcycle bike: bikeList) {
            bike.setName(Nr++);
        }
    }

    private void initTrucks(){
        Truck[] truckList = new Truck[10];
        for (int i = 0; i < 10; i++) {
            truckList[i] = new Truck();
        }
        this.truckList = truckList;
    }

    private void setTrucks(){
        for (Truck truck: truckList) {
            truck.setName(random.nextInt(1000));
        }
    }
}