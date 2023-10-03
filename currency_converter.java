import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class currency_converter {
    private static Map<String, Double> exchangerates;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //exchange rates 
        Map<String, Double> exchangerate = new HashMap<>();
        exchangerate.put("USD", 1.0);
        exchangerate.put("EUR", 0.85);
        exchangerate.put("GBP", 0.74);
        exchangerate.put("JPY", 109.75);

        System.out.println("!!!!WELCOME TO THE CURRENCY CONVERTER!!!!");

        System.out.println(); 
        for(String currency : exchangerate.keySet()) {
            System.out.println(currency);
        }

        System.out.println("enter the base currency: ");
        String base = scanner.nextLine().toUpperCase();
        System.out.println("enter the target cuurency: ");
        String target = scanner.nextLine().toUpperCase();

        System.out.println("enter amount to be converted: ");
        double convertingamount = scanner.nextDouble();

        double exchangeRates = exchangerate.get(target) / exchangerate.get(base);
        double convertedto = convertingamount*exchangeRates;

        //Result
        System.out.println("Converted amount is: "+ convertedto);
        scanner.close();
    }
}
