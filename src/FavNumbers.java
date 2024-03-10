import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite integer
        int favoriteInt = SafeInput.getInt(scanner, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favoriteInt);

        // Prompt the user to enter their favorite double
        double favoriteDouble = SafeInput.getDouble(scanner, "Enter your favorite double: ");
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }
}
