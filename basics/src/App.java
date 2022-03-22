import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner scan=new Scanner(System.in);
        
        int weight;
        System.out.print("How much does your dog weigh?");
        weight = scan.nextInt();
        
        int days;
        System.out.print("How many days will your dog stay with us?");
        days = scan.nextInt();
        final double COST_PER_DAY=12;
        
        Double total_cost;
        total_cost = COST_PER_DAY*days*weight;
        System.out.printf("The total cost is $%.2f", total_cost);

        scan.close();

    }
}
