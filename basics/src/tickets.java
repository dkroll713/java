import java.util.Scanner;

public class tickets {
    public static void main(String[] args) throws Exception {

        int ticketNumber;
        Scanner scan=new Scanner(System.in);
        ticketNumber=scan.nextInt();

        int firstFiveDigits=ticketNumber/10;
        System.out.println("The first five digits are: "+firstFiveDigits);
        int lastDigit=ticketNumber%10;
        System.out.println("The last digit is: "+lastDigit);
        int remainder=firstFiveDigits%7;
        System.out.println("The remainder is: "+remainder);
        boolean result;
        result=(0==remainder);

        System.out.printf("The result is %b", result);

        scan.close();
    }
}
