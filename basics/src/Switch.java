import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws Exception{
        Scanner  scan=new Scanner(System.in);
        int year;
        System.out.print("Please enter the year: ");
        year=scan.nextInt();

        switch(year){
            case 1:
                System.out.println("Freshman");
                break;
            case 2:
                System.out.println("Sophomore");
                break;
            case 3:
                System.out.println("Junior");
                break;
            case 4:
                System.out.println("Senior");
                break;
            default:
                System.out.println("Invalid year.");
        }


        scan.close();
    }
}
