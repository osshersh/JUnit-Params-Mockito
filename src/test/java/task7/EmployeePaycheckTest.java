package task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class EmployeePaycheckTest {
    EmployeePaycheck employeePaycheck;
    PaycheckWeekendService paycheckWeekendService;
    PaycheckService paycheckService;

    @BeforeEach
    void init() {
        paycheckWeekendService = Mockito.mock(PaycheckWeekendService.class);
        paycheckService = Mockito.mock(PaycheckService.class);
        employeePaycheck = new EmployeePaycheck(paycheckService, paycheckWeekendService);
    }

    @Test
    void shouldCalculatePaycheckWhenIsOnlySalary() {
        Mockito.when(paycheckService.getSalary()).thenReturn(2.0);
        assertEquals(2.0, employeePaycheck.calculatePaycheckEmployee(0));
    }

    @Test
    void shouldCalculatePaycheckEmployee() {
        Mockito.when(paycheckWeekendService.getPaidForSaturday()).thenReturn(1.0);
        Mockito.when(paycheckService.getSalary()).thenReturn(2.0);
        Mockito.when(paycheckService.getBonus()).thenReturn(1.0);
        assertEquals(4.0, employeePaycheck.calculatePaycheckEmployee(1));
    }

    @Test
    void shouldCalculateWeekendPaycheckEmployee() {
        Mockito.when(paycheckWeekendService.getPaidForSaturday()).thenReturn(1.0);
        assertEquals(1.0, employeePaycheck.calculatePaycheckForSaturday(1));

    }

    @Test
    void shouldCalculatePaycheckEmployeeWhenBonusIsZero() {
        Mockito.when(paycheckService.getSalary()).thenReturn(1.0);
        Mockito.when(paycheckService.getBonus()).thenReturn(0.0);
        Mockito.when(paycheckWeekendService.getPaidForSaturday()).thenReturn(1.0);
        assertEquals(3, employeePaycheck.calculatePaycheckEmployee(2));
    }
}