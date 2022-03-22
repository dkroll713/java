import java.util.Scanner;

public class CreateEmployee {
    public static void main(String[] args) throws Exception {
        Employee emp=new Employee();
        
        System.out.print("\n"+emp.getEmployeeFirstName()+" "+emp.getEmployeeLastName()+", "+emp.getEmployeeNumber()+" "+emp.getEmployeeSalary());

        Scanner scan=new Scanner(System.in);
        int employeeNumber;
        System.out.print("\nPlease enter the employee number: ");
        employeeNumber=scan.nextInt();
        emp.setEmployeeNumber(employeeNumber);
        System.out.print(emp.getEmployeeNumber());

        String empFirstName;
        System.out.println("\nPlease enter the employee's first name: ");
        empFirstName=scan.next();
        emp.setEmployeeFirstName(empFirstName);

        if(empFirstName!=null){
            String empLastName;
            System.out.println("\nPlease enter the employee's last name: ");
            empLastName=scan.next();
            emp.setEmployeeLastName(empLastName);
        }

        double empSalary;
        System.out.print("\nPlease enter the employee's salary: ");
        empSalary=scan.nextDouble();
        emp.setEmployeeSalary(empSalary);
        scan.close();

        System.out.print("\n"+emp.getEmployeeFirstName()+" "+emp.getEmployeeLastName()+", "+emp.getEmployeeNumber()+" "+emp.getEmployeeSalary());
    }
}
