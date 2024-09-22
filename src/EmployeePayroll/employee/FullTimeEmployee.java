package src.EmployeePayroll.employee;

public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(String firstName, String lastName, double salary){
      super(firstName,lastName);
      calculateSalary(salary);
      System.out.println("Inside FullTimeEmployee Constructor");
    }
  
    public double getSalary(){
      System.out.println("Inside FullTimeEmployee getSalary Method");
      return super.getSalary();
    }

    public void calculateSalary(double salary)
    {
      setSalary(salary);
    }

  }
