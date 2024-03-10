import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test SSN pattern
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (###-##-####): ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN entered: " + ssn);

        // Test UC Student M number pattern
        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (M#####): ", "^(M|m)\\d{5}$");
        System.out.println("UC Student M number entered: " + mNumber);

        // Test menu choice pattern
        String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice (O - Open, S - Save, V - View, Q - Quit): ", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + menuChoice);

        scanner.close();
    }
}
