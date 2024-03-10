import java.util.Scanner;

class BirthInfoInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input birth year (1950-2015)
        int birthYear = SafeInput.getRangedInt(scanner, "Enter your birth year (1950-2015): ", 1950, 2015);

        // Input birth month (1-12)
        int birthMonth = SafeInput.getRangedInt(scanner, "Enter your birth month (1-12): ", 1, 12);

        // Input birth day based on the month
        int maxDaysInMonth = switch (birthMonth) {
            case 2 -> // February
                // Assume non-leap year for simplicity
                    28;
            case 4, 6, 9, 11 -> // April, June, September, November
                    30;
            default -> // All other months
                    31;
        };
        int birthDay = SafeInput.getRangedInt(scanner, "Enter your birth day (1-" + maxDaysInMonth + "):", 1, maxDaysInMonth);

        // Input birth hours (1-24)
        int birthHours = SafeInput.getRangedInt(scanner, "Enter the hour of your birth (1-24):", 1, 24);

        // Input birth minutes (1-59)
        int birthMinutes = SafeInput.getRangedInt(scanner, "Enter the minutes of your birth (1-59):", 1, 59);

        // Display the inputted birth information
        System.out.println("Your birth information:");
        System.out.println("Year: " + birthYear);
        System.out.println("Month: " + birthMonth);
        System.out.println("Day: " + birthDay);
        System.out.println("Hour: " + birthHours);
        System.out.println("Minutes: " + birthMinutes);

        scanner.close();
    }
}
