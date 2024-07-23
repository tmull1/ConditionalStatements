import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double numberOne = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double numberTwo = scanner.nextDouble();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are the same");
        } else if (numberOne > numberTwo) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }

        scanner.close();
    }
}
