package src.EmployeePayroll.employee;

public class HourlyEmployee extends Employee{
  
    private double workedHours;
    private double rate;
    
    public HourlyEmployee(String firstName, String lastName, double workedHours, double rate){
      super(firstName,lastName);
      this.rate = rate; //200
      this.workedHours = workedHours; //50
      calculateSalary(0);
      System.out.println("Inside HourlyEmployee Constructor");
    }
  
    public double getSalary(){
      System.out.println("Inside HourlyEmployee getSalary Method");
      return super.getSalary();
    }

    public void calculateSalary(double salary)
    {
      setSalary(this.rate * this.workedHours); //200*50 = 10000
    }
  }

