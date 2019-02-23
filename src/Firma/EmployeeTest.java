package Firma;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Jacek Placek", 1000, 1966, 7, 19);
        staff[1] = new Employee("Kuba Rozpruwacz", 2000, 1970, 1, 20);
        staff[2] = new Employee("John Wayn", 3000, 1980, 8, 30);
        for(Employee e : staff){
            e.riseSalary(5);
            for(Employee e : staff){
                System.out.println("Name: " + e.getName() + " .Salary = " + e.getSalary() + "Hire Date: " + e.getHireDate());
            }
        }
    }
}
