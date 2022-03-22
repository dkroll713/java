import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("Please enter a number:");
        num=scan.nextInt();
        if(num%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scan.close();
    }
}
