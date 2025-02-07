import java.util.Scanner;

public class CustomExceptionDemo {

    public static void checkForNegativeNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Error: The number is negative.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            checkForNegativeNumber(number);
            System.out.println("The number is valid: " + number);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}