import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) throws Exception{
        String userID;
        String password;
        final String adminUserID="admin";
        final String adminPassword="admin";
        int attempts;

        try (Scanner scan = new Scanner(System.in)) {
            for(attempts=1;attempts<=3;attempts++){
                System.out.print("Please enter user ID: ");
                userID=scan.nextLine();
                System.out.print("Please enter password: ");
                password=scan.nextLine();

                if(adminUserID.equals(userID) && adminPassword.equals(password)){
                    System.out.println("Welcome");
                    break;
                } else {
                    if(attempts<3){
                        System.out.println("Incorrect userID/password combination.");
                    } else {
                        System.out.println("Incorrect userID/password. \nYour account has been locked, please contact the system administrator.");
                    }
                }
            }
        }
    }
}
