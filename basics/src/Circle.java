import java.util.Scanner;

public class Circle {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        int radius;
        final double PI=3.14;
        System.out.println("Please enter the radius of the circle: ");
        radius=scan.nextInt();

        double circleArea;
        circleArea=PI*(radius*radius);
        System.out.println("The area of the circle is: " + circleArea);

        scan.close();
    }
    
}
