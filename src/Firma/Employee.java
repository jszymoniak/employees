package Firma;
import java.time.*;
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDate = LocalDate.of(year, month, day);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }
    public void riseSalary(double byPercent){
        double rise = salary*byPercent/100;
        salary += rise;
    }
}
