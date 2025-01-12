//
//public class Main {
//    public static void main(String[] args) {
//
//        Car car1 = new Car("Toyota", "Camry", 2020, "ABC1234");
//        Car car2 = new Car("Honda", "Civic", 2022, "XYZ5678");
//
//        car1.printInfo();
//        car2.printInfo();
//    }
//}

//import java.util.Scanner;
//public class Main {
//
//    public static int sumOfNaturalNumbers(int n) {
//
//        if (n == 1) {
//            return 1;
//        }
//
//        return n + sumOfNaturalNumbers(n - 1);
//    }
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number n: ");
//        int n = scanner.nextInt();
//
//        int result = sumOfNaturalNumbers(n);
//        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + result);
//
//        scanner.close();
//    }
//}


import java.util.Scanner;

public class Main {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer a: ");
        int a = scanner.nextInt();
        System.out.print("Enter a positive integer n (exponent): ");
        int n = scanner.nextInt();

        int result = power(a, n);
        
        System.out.println("The value of " + a + " raised to the power of " + n + " is: " + result);

        scanner.close();
    }
}



