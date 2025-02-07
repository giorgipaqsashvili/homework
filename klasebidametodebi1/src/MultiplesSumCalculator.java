import java.util.Scanner;

public class MultiplesSumCalculator {

    public static int sumOfMultiples(int a, int b, int k) {

        if (a > b) {
            return 0;
        }

        if (a % k == 0) {
            return a + sumOfMultiples(a + 1, b, k);  // Include 'a' in the sum and recurse with the next number
        } else {
            return sumOfMultiples(a + 1, b, k);  // Skip 'a' and recurse with the next number
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int result = sumOfMultiples(a, b, k);

        System.out.println("The sum of multiples of " + k + " in the range [" + a + ", " + b + "] is: " + result);

        scanner.close();
    }
}