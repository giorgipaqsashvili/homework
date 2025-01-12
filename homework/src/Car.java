public class Car {
    private String manufacturer;
    private String model;
    private String licensePlateNumber;
    private Engine engine; // Inner class Engine object

    public Car(String manufacturer, String model, String licensePlateNumber, String fuelType, int numCylinders, double mileage) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlateNumber = licensePlateNumber;
        this.engine = new Engine(fuelType, numCylinders, mileage); // Initialize engine
    }

    public double getEngineMileage() {
        return engine.mileage;
    }

    public void printCarInfo() {
        System.out.println("Car Manufacturer: " + manufacturer);
        System.out.println("Car Model: " + model);
        System.out.println("License Plate: " + licensePlateNumber);
        engine.printEngineInfo();
    }

    public class Engine {
        private String fuelType;
        private int numCylinders;
        private double mileage;

        public Engine(String fuelType, int numCylinders, double mileage) {
            this.fuelType = fuelType;
            this.numCylinders = numCylinders;
            this.mileage = mileage;
        }

        public void printEngineInfo() {
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Number of Cylinders: " + numCylinders);
            System.out.println("Engine Mileage: " + mileage + " km");
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", "Camry", "XYZ123", "Petrol", 4, 120000);
        cars[1] = new Car("Honda", "Civic", "ABC456", "Diesel", 4, 150000);
        cars[2] = new Car("Ford", "Mustang", "LMN789", "Petrol", 8, 100000);

        Car maxMileageCar = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getEngineMileage() > maxMileageCar.getEngineMileage()) {
                maxMileageCar = cars[i];
            }
        }

        System.out.println("\nCar with the maximum engine mileage:");
        maxMileageCar.printCarInfo();
    }
}
