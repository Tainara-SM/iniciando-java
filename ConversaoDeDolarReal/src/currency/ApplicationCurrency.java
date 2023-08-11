package currency;

import java.util.Locale;
import java.util.Scanner;

import calculator.CurrencyConverter;

public class ApplicationCurrency {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Real to Dollar converter-----");
        System.out.println("What is the dollar price: ");
        double dollarPrice = scan.nextDouble();
        System.out.println("How many dollar will be bought? ");
        double quantDollar = scan.nextDouble();

        double valueDollar = CurrencyConverter.currencyDollar(dollarPrice, quantDollar);

        System.out.printf("Amount to be paid in reais: %.2f%n", valueDollar);




        scan.close();

    }
}
