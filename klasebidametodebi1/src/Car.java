public class Car {

    private String carMake;
    private String carModel;
    private int yearOfManufacture;
    private String vehicleRegistrationNumber;

    public Car(String carMake, String carModel, int yearOfManufacture, String vehicleRegistrationNumber) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }


    public void printInfo() {
        System.out.println("Car Make: " + carMake);
        System.out.println("Car Model: " + carModel);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Vehicle Registration Number: " + vehicleRegistrationNumber);
        System.out.println("-------------------------------");
    }


    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }
}
