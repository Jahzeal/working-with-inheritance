package Assignments;

import org.w3c.dom.ls.LSOutput;

class Employee1 {
    public void work() {
        System.out.println("Employee is working.");
    }
}
class getsalary{
    public void getsalary(){
        int salary = 45643;
        System.out.println("employee earns " + salary);
    }


}

class HRManager extends Employee1 {
    public void work() {
        System.out.println("HR Manager is managing employees and recruiting new ones.");

    }

    public void addEmployee(Employee1 employee) {
        String Employe = "tunde";
        System.out.println("HR Manager added a new employee: " + Employe);
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee1 employee = new Employee1();
        employee.work();
        getsalary Getsalary = new getsalary();
        Getsalary.getsalary();

        // Try to get salary (will raise an error)


        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee(employee);
    }
}

