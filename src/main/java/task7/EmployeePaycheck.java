package task7;

public class EmployeePaycheck {
    private PaycheckService paycheckService;
    private PaycheckWeekendService paycheckWeekendService;

    public EmployeePaycheck(PaycheckService paycheckService, PaycheckWeekendService paycheckWeekendService) {
        this.paycheckService = paycheckService;
        this.paycheckWeekendService = paycheckWeekendService;
    }

    public double calculatePaycheckEmployee(int numberSaturdays) {
        return paycheckService.getSalary() + paycheckService.getBonus() + calculatePaycheckForSaturday(numberSaturdays);
    }

    public double calculatePaycheckForSaturday(int numberSaturdays) {
        if (numberSaturdays == 0) {
            return 0;
        }
        return numberSaturdays * paycheckWeekendService.getPaidForSaturday();
    }
}
