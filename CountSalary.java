public class CountSalary {

    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski", 5000);
        PaymentCalculator pc = new PaymentCalculator();

        System.out.println(employee);
        System.out.println("Annual salary net: " + pc.netYearPayment(employee));

        System.out.println("Annual salary gross: " + pc.grossYearPayment(employee));

    }
}
