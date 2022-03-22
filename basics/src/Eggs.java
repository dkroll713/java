import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) throws Exception {
        System.out.print("This program determines how many eggs you want to purchase & how much it will cost.");
        Scanner scan=new Scanner(System.in);
        
        int numberOfEggs;
        final double COST_PER_DOZEN=3.25;
        final double COST_PER_EGG=.45;
        System.out.println("\nPlease enter the number of eggs: ");
        numberOfEggs=scan.nextInt();

        int dozensOrdered,looseEggs;
        dozensOrdered=numberOfEggs/12;
        looseEggs=numberOfEggs%12;
        double total_cost;
        total_cost=(dozensOrdered*COST_PER_DOZEN)+(looseEggs+COST_PER_EGG);

        System.out.printf("You ordered %d eggs. Your total cost is $%.2f.",numberOfEggs,total_cost);
        scan.close();
    }
}
