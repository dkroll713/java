package src;

import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        String name, firstName=null,middleName=null,lastName=null;

        System.out.print("Please enter your full name: ");
        name=scan.nextLine();

        String[] arr=name.split(" ");
        firstName=arr[0].trim();
        middleName=arr[1].trim();
        lastName=arr[2].trim();

        System.out.println("First name: "+firstName);
        System.out.println("Middle name: "+middleName);
        System.out.println("Last name: "+lastName);

        scan.close();
    }
}
