import java.util.Scanner;

public class CurrencyConverterMock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base currency (e.g., USD): ");
        String base = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency (e.g., INR): ");
        String target = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        // Simulated exchange rate — you can change this
        double exchangeRate = 83.12; // Example USD to INR rate

        double converted = amount * exchangeRate;
        System.out.printf("Converted Amount: %.2f %s\n", converted, target);
        scanner.close();
    }
}
