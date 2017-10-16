import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

class Vehicles {

    Car[] carList;
    Motorcycle[] bikeList;
    Truck[] truckList;
    private Random random = new Random();
    private static Vehicles instance;

    static Vehicles getInstance() {
        if (instance == null){
            instance = new Vehicles();
        }
        return instance;
    }

    void initCars(int howMany){
        Car[] carList = new Car[howMany];
        for (int i = 0; i < howMany; i++) {
            carList[i] = new Car();
        }
        this.carList = carList;
    }

    void setCars(int howMany){
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
        } while(indexes.size() < howMany);

        Iterator<Integer> it = indexes.iterator();

        for (Car car: carList) {
            int nameIndex = it.next();
            String fullName = carsFirstName[nameIndex] + carsSecondName[nameIndex];
            car.setSpeed(random.nextInt(110-80)+80);
            car.setName(fullName);
        }
    }

    void initMotorcycles(int howMany){
        Motorcycle[] bikeList = new Motorcycle[howMany];
        for (int i = 0; i < 10; i++) {
            bikeList[i] = new Motorcycle();
        }
        this.bikeList = bikeList;
    }

    void setMotorcycles(){
        int Nr = 1;
        for (Motorcycle bike: bikeList) {
            bike.setName(Nr++);
        }
    }

    void initTrucks(int howMany){
        Truck[] truckList = new Truck[howMany];
        for (int i = 0; i < howMany; i++) {
            truckList[i] = new Truck();
        }
        this.truckList = truckList;
    }

    void setTrucks(){
        for (Truck truck: truckList) {
            truck.setName(random.nextInt(1000));
        }
    }
}