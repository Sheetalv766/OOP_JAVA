package src.EmployeePayroll;

import java.util.List;
import src.EmployeePayroll.employee.Employee;
import java.util.ArrayList;

public class Payroll{
  List<Employee> employees = new ArrayList<Employee>();

  public void add(Employee e){
    employees.add(e);
  }

  public void print(){
    for(Employee e : employees){
      System.out.println(e.fullName() +"\t Rs."+ e.getSalary());
    }
  }
}

