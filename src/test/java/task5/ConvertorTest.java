package task5;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ConvertorTest {

    @Test
    void shouldConvertZlotyToCurrencyBay() {
        CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
        Convertor convertor = new Convertor(currencyValueProvider);
        when(currencyValueProvider.getBuyValueOfCurrency(ArgumentMatchers.any())).thenReturn(1.0);
        double value = convertor.convertZlotyToCurrencyBay(3, Currency.DOLLAR);
        assertEquals(3, value);

    }

    @Test
    void shouldConvertZlotyToCurrencySell() {
        CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
        Convertor convertor = new Convertor(currencyValueProvider);
        when(currencyValueProvider.getSellValueOfCurrency(ArgumentMatchers.any())).thenReturn(2.0);
        double value = convertor.convertZlotyToCurrencySell(2, Currency.DOLLAR);
        assertEquals(4, value);
    }
}