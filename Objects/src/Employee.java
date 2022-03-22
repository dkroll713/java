public class Employee {
    private int employeeNumber;
    private String empLastName, empL;
    private String empFirstName, empF;
    private double empSalary;


    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public void setEmployeeNumber(int emp){
        employeeNumber=emp;
    }
    public String getEmployeeFirstName(){
        empF=empFirstName;
        return empF;
    }

    public void setEmployeeFirstName(String FirstName){
        empFirstName=FirstName;
    }

    public String getEmployeeLastName(){
        empL=empLastName;
        return empL;
    }

    public void setEmployeeLastName(String LastName){
        empLastName=LastName;
    }

    public double getEmployeeSalary(){
        return empSalary;
    }

    public void setEmployeeSalary(double salary){
        empSalary=salary;
    }
}