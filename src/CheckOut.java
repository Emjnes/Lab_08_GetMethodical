import java.util.Scanner;

class Checkout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        // Prompt the user for the price of the first item
        double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of the item ($0.50 - $10.00): ", 0.50, 10.00);
        totalCost += itemPrice;

        // Prompt the user if they have more items using getYNConfirm method
        boolean hasMoreItems;
        do {
            hasMoreItems = SafeInput.getYNConfirm(scanner, "Do you have more items to add? (Y/N)");
            if (hasMoreItems) {
                // Prompt the user for the price of the next item
                itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of the item ($0.50 - $10.00): ", 0.50, 10.00);
                totalCost += itemPrice;
            }
        } while (hasMoreItems);

        scanner.close();

        // Display the total cost of the items to 2 decimal places with printf
        System.out.printf("Total cost of the items: $%.2f%n", totalCost);
    }
}
