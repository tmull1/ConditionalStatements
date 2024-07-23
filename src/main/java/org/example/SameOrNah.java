import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String wordOne = scanner.nextLine();
        System.out.print("Enter another word: ");
        String wordTwo = scanner.nextLine();


        if (wordOne.equalsIgnoreCase(wordTwo)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }

        scanner.close();
    }
}

