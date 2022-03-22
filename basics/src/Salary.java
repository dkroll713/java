import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        final double TAX_RATE = 0.15;
        double salary;
        double incomeTax;
        double grossSalary;
        System.out.println("What is your salary? ");
        salary=scan.nextDouble();
        incomeTax=salary*TAX_RATE;
        grossSalary=salary-incomeTax;

        System.out.printf("Your gross salary is $%.2f and you pay income taxes of $%.2f",grossSalary,incomeTax);
        scan.close();
    }
    
}
