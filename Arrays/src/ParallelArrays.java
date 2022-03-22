import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) throws Exception{
        // final int NUMBER_OF_ITEMS=4;
        int[] validValues={101,108,210,213};
        double[] prices={2.99,3.99,4.99,5.99};
        boolean isValidItem=false;

        Scanner scan=new Scanner(System.in);
        int item;
        double itemPrice=0;

        for(int i=0; i<validValues.length;i++){
            System.out.print(validValues[i]+", ");
        }

        do{
            System.out.print("\nPlease enter the item number you wish to order: ");
            item=scan.nextInt();
            for(int x=0;x<validValues.length;x++){
                if(item==validValues[x]){
                    isValidItem=true;
                    itemPrice=prices[x];
                    System.out.printf("The price of the item is $%.2f",itemPrice);
                }
            }
        } while (isValidItem!=true);
        scan.close();
    }
}
