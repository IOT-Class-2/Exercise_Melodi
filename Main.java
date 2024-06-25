package mext.test.rectangle.iki;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("salary melodi",80000,25);

        Salesperson employeeTwo = new Salesperson("matt",65000,35, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();
        employeeTwo.raiseCommission();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}
