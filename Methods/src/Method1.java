import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) throws Exception {
        double salary;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Please enter your salary: ");
            salary=scan.nextDouble();
        }

        predictRaise(salary);
    }

    static void predictRaise(double salary){
        double newSalary;
        final double RAISE_RATE=1.1;
        newSalary=salary*RAISE_RATE;
        System.out.printf("The new salary is $%.2f", newSalary);
    }
}
