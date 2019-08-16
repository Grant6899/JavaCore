package inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        this.hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        this.salary += salary * byPercent / 100;
    }

    public Date getHireDay() {
        return hireDay;
    }
}