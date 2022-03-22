import java.util.InputMismatchException;
import java.util.Scanner;

import pkgBilling.BillingMethods;

public class BillingUser {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        double price,couponValue,totalPrice;
        int qty;

        try{
            System.out.print("Please enter the per-unit price of the items: ");
            price=scan.nextDouble();

            System.out.print("\nPlease enter the quantity to be purchased: ");
            qty=scan.nextInt();

            System.out.print("\nPlease enter the coupon value, if any, else enter 0: ");
            couponValue=scan.nextDouble();

            if(qty<=1 && couponValue==0){
                totalPrice=BillingMethods.computeBill(price);
            } else if(qty>1 && couponValue==0){
                totalPrice=BillingMethods.computeBill(price,qty);
            } else totalPrice=BillingMethods.computeBill(price,qty,couponValue);
            System.out.printf("The final price of the item is $%.2f", totalPrice);
        } catch(InputMismatchException e){
            System.out.print("Please enter a number: ");
            e.printStackTrace();
        }
    }
}