import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 212:");
        double temperature = scanner.nextDouble();

        if (temperature >= 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water is not boiling.");
        }

        scanner.close();
    }
}

