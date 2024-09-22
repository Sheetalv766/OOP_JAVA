package src.EmployeePayroll;

import src.EmployeePayroll.employee.FullTimeEmployee;
import src.EmployeePayroll.employee.HourlyEmployee;

public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        payroll.add(new FullTimeEmployee("John", "Doe", 6000));
        payroll.add(new FullTimeEmployee("Jane", "Doe", 6500));
        payroll.add(new HourlyEmployee("Jenifer", "Smith", 200, 50));
        payroll.add(new HourlyEmployee("David", "Wilson", 150, 100));
        payroll.add(new HourlyEmployee("Kevin", "Miller", 100, 150));
        
        payroll.print();
    }
}

//     public static void main (String[] args){
//         FullTimeEmployee emp1 =new FullTimeEmployee("John", "Doe", 6000);
//         HourlyEmployee emp2 =new HourlyEmployee("Jenifer", "Smith", 200, 50);
//         System.out.println(emp1.getSalary());
//         System.out.println(emp2.getSalary());
//     }
// }

