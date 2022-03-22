package pkgBilling;

public class BillingMethods {
    public static double computeBill(double price){
        double totalPrice;
        totalPrice=price*1.08;
        return totalPrice;
    }
    public static double computeBill(double price, int qty){
        double totalPrice;
        totalPrice=(price*qty)*1.08;
        return totalPrice;
    }
    public static double computeBill(double price, int qty, double coupon){
        double totalPrice, discountedPrice;
        discountedPrice=(qty*price)-coupon;
        totalPrice=discountedPrice*1.08;
        return totalPrice;
    }
}
