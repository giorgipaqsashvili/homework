import java.util.Scanner;

public class SquareRootCalculator {

    public static double calculateSquareRoot(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Error: Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            double result = calculateSquareRoot(number);
            System.out.println("The square root of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

