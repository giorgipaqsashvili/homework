public class Computer {
    private String countryOfManufacture;
    private String brand;
    private double price;
    private boolean hasWarranty;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(String countryOfManufacture, String brand, double price, boolean hasWarranty,
                    double monitorDiagonal, String monitorResolution, int monitorHertz,
                    int ramSlots, String ramType, int fsbSpeed) {
        this.countryOfManufacture = countryOfManufacture;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
        this.monitor = new Monitor(monitorDiagonal, monitorResolution, monitorHertz);
        this.motherboard = new Motherboard(ramSlots, ramType, fsbSpeed);
    }

    public void printComputerInfo() {
        System.out.println("Computer Brand: " + brand);
        System.out.println("Country of Manufacture: " + countryOfManufacture);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + (hasWarranty ? "Yes" : "No"));
        monitor.printMonitorInfo();
        motherboard.printMotherboardInfo();
    }

    public class Monitor {
        private double diagonal;
        private String resolution;
        private int hertz;

        public Monitor(double diagonal, String resolution, int hertz) {
            this.diagonal = diagonal;
            this.resolution = resolution;
            this.hertz = hertz;
        }

        public void printMonitorInfo() {
            System.out.println("Monitor Diagonal: " + diagonal + " inches");
            System.out.println("Monitor Resolution: " + resolution);
            System.out.println("Monitor Refresh Rate: " + hertz + " Hz");
        }
    }

    public class Motherboard {
        private int ramSlots;
        private String ramType;
        private int fsbSpeed;

        public Motherboard(int ramSlots, String ramType, int fsbSpeed) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }

        public void printMotherboardInfo() {
            System.out.println("Motherboard RAM Slots: " + ramSlots);
            System.out.println("Motherboard RAM Type: " + ramType);
            System.out.println("Motherboard FSB Speed: " + fsbSpeed + " MHz");
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer("USA", "Dell", 1200.00, true,
                27.0, "2560x1440", 144,
                4, "DDR4", 3200);
        computer.printComputerInfo();
    }
}
