package abstractClasses;

import java.util.GregorianCalendar;
import java.util.Date;

public class Employee extends Person {
    private double salary;
    private Date hireDay;

    public Employee(String n, double salary, int year, int month, int day) {
        super(n);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        this.hireDay = calendar.getTime();
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent){
        this.salary += salary * byPercent / 100;
    }
}
