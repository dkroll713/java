import java.util.Scanner;

public class ConstantsAndConditionals {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);

        final double PARK_VIEW=150000;
        final double GOLF_COURSE=200000;
        final double LAKE_VIEW=250000;
        int userChoice;
        String condoType;

        System.out.print("Please enter 1 for Park View, 2 for Golf Course, and 3 for Lake View: ");
        userChoice=scan.nextInt();
        double condoPrice;

        if(userChoice==1){
            condoPrice=PARK_VIEW;
            condoType="Park view";
        } else if(userChoice==2){
            condoPrice=GOLF_COURSE;
            condoType="Golf Course view";
        } else if(userChoice==3){
            condoPrice=LAKE_VIEW;
            condoType="Lake view";
        } else {
            condoPrice=0;
            condoType="";
        }

        int parkingChoice;
        final double GARAGE_PRICE=2500;
        double totalPrice=0;

        if (userChoice==1||userChoice==2||userChoice==3){
            System.out.print("Please enter 1 for a garage space and 2 for an outdoor parking space: ");
            parkingChoice=scan.nextInt();

            if(parkingChoice==1){
                totalPrice=condoPrice+GARAGE_PRICE;
            } else {
                totalPrice=condoPrice;
            }
        }

        System.out.printf("The price of a %s condo is $%.2f",condoType,totalPrice);

        scan.close();
    }
}
