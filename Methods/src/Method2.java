import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) throws Exception{

        double salary;
        double newSalary;
        final double RAISE_RATE=1.2;
        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter your salary: ");
        salary=scan.nextDouble();

        newSalary=predictRaise(salary,RAISE_RATE);
        calculateBonus(newSalary);
    }

    static double predictRaise(double sal, double rate){
        double newSalary;
        newSalary=sal*rate;
        System.out.println("Your new salary is: "+newSalary);
        return newSalary;
    }

    static double calculateBonus(double newSalary){
        final double BONUS_AMT=1000.00;
        newSalary=newSalary+BONUS_AMT;
        System.out.print("Including a potential bonus, your total salary is: "+newSalary);
        return newSalary;
    }
}