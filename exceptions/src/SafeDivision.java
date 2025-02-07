import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int num = Integer.parseInt(input);

            int result = 100 / num;
            System.out.println("100 divided by " + num + " is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input, please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
