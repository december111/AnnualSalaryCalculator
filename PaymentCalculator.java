public class PaymentCalculator {

    private static final int NUMBER_OF_MONTHS = 12;
    private static final double TAX_RATE = 0.2; //20% taxes
    private static final int DEDUCTIONS = 500;

    public double netYearPayment(Employee employee){
        double salary = employee.getSalary();
        return salary * NUMBER_OF_MONTHS;
    }

    public double grossYearPayment(Employee employee){
        double salary = employee.getSalary();
        return netYearPayment(employee) + countAnnualTaxes(salary) + countAnnualDeductions();
    }

    private double countAnnualTaxes(double salary){
        return NUMBER_OF_MONTHS * (salary * TAX_RATE);
    }

    private double countAnnualDeductions(){
        return DEDUCTIONS * NUMBER_OF_MONTHS;
    }
}
