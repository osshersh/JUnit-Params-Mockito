package task5;

public class Convertor {

    private final CurrencyValueProvider currencyValueProvider;

    public Convertor(CurrencyValueProvider currencyValueProvider) {
        this.currencyValueProvider = currencyValueProvider;
    }

    public double convertZlotyToCurrencyBay(double value, Currency currency) {
        return value * currencyValueProvider.getBuyValueOfCurrency(currency);
    }

    public double convertZlotyToCurrencySell(double value, Currency currency){
        return value * currencyValueProvider.getSellValueOfCurrency(currency);
    }

}
