package calculator;

public class CurrencyConverter {

    public static double currencyDollar(double dollarPrice, double quantDollar){
        return  dollarPrice * quantDollar + (dollarPrice * quantDollar * 6) / 100; //taxa de 6% IOF
    }

}
