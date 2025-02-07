//abstract class Shape {
//    public abstract double getArea();
//    public abstract double getPerimeter();
//}
//
//class Circle extends Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    private double length;
//    private double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    public double getArea() {
//        return length * width;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }
//
//    public double getDiagonal() {
//        return Math.sqrt(length * length + width * width);
//    }
//}
//
//class Triangle extends Shape {
//    private double side1;
//    private double side2;
//    private double side3;
//
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    @Override
//    public double getArea() {
//        double semiPerimeter = (side1 + side2 + side3) / 2;
//        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side1 + side2 + side3;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Circle circle = new Circle(5);
//        System.out.println("Circle Area: " + circle.getArea());
//        System.out.println("Circle Perimeter: " + circle.getPerimeter());
//
//        Rectangle rectangle = new Rectangle(4, 6);
//        System.out.println("\nRectangle Area: " + rectangle.getArea());
//        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
//        System.out.println("Rectangle Diagonal: " + rectangle.getDiagonal());
//
//        Triangle triangle = new Triangle(3, 4, 5);
//        System.out.println("\nTriangle Area: " + triangle.getArea());
//        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
//    }
//}

// Base class Product
class Product {
    private double price;
    private String expiration;

    // Constructor for Product
    public Product(double price, String expiration) {
        this.price = price;
        this.expiration = expiration;
    }

    // Getters and Setters for Product
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}

// Milk class - subclass of Product
class Milk extends Product {
    private double volume;

    // Constructor for Milk
    public Milk(double price, String expiration, double volume) {
        super(price, expiration);
        this.volume = volume;
    }

    // Getter and Setter for Volume
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

// Cake class - subclass of Product
class Cake extends Product {
    private double weight;

    // Constructor for Cake
    public Cake(double price, String expiration, double weight) {
        super(price, expiration);
        this.weight = weight;
    }

    // Getter and Setter for Weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

// Sandwich class - subclass of Product
class Sandwich extends Product {
    private double length;

    // Constructor for Sandwich
    public Sandwich(double price, String expiration, double length) {
        super(price, expiration);
        this.length = length;
    }

    // Getter and Setter for Length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

// Shop class that holds an array of Products
class Shop {
    private Product[] products;

    // Constructor for Shop, initializes products array
    public Shop(Product[] products) {
        this.products = products;
    }

    // Getter for Products
    public Product[] getProducts() {
        return products;
    }

    // Setter for Products
    public void setProducts(Product[] products) {
        this.products = products;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create individual products
        Milk milk = new Milk(2.5, "2025-12-01", 1.0);  // Price, Expiration, Volume
        Cake cake = new Cake(5.0, "2024-05-01", 0.75); // Price, Expiration, Weight
        Sandwich sandwich = new Sandwich(3.0, "2024-01-01", 10.0); // Price, Expiration, Length

        // Add products to the shop
        Product[] products = {milk, cake, sandwich};

        // Create a shop and set products
        Shop shop = new Shop(products);

        // Display the products in the shop
        for (Product product : shop.getProducts()) {
            System.out.println("Price: " + product.getPrice() + ", Expiration: " + product.getExpiration());

            // Check the type of product and display additional attributes
            if (product instanceof Milk) {
                System.out.println("Volume: " + ((Milk) product).getVolume() + " liters");
            } else if (product instanceof Cake) {
                System.out.println("Weight: " + ((Cake) product).getWeight() + " kg");
            } else if (product instanceof Sandwich) {
                System.out.println("Length: " + ((Sandwich) product).getLength() + " cm");
            }

            System.out.println();  // Blank line between products
        }
    }
}


