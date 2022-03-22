import java.util.Scanner;

public class Temp {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);

        int highTemp,lowTemp;
        System.out.print("Please enter the high temperature for the day: ");
        highTemp=scan.nextInt();
        System.out.print("Please enter the low temp for the day: ");
        lowTemp=scan.nextInt();

        if(highTemp>=90){
            System.out.println("Heat warning");
        }
        if(lowTemp<32){
            System.out.println("Freeze warning");
        }
        if((highTemp-lowTemp)>=40){
            System.out.println("Large temperature swing!");
        }

        scan.close();
    }
}
