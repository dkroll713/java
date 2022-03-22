import java.util.Scanner;

public class FiveLettersAndFiveDigits {
    public static void main(String[] args) throws Exception{
        String userInput;
        int letterCount=0;
        int digitCount=0;

        Scanner scan=new Scanner(System.in);

        do{
            letterCount=0;
            digitCount=0;
            System.out.println("Please enter a valid string: ");
            userInput=scan.nextLine();

            for(int i=0;i<userInput.length();i++){
                char ch=userInput.charAt(i);
                if(Character.isLetter(ch)){
                    letterCount++;
                } else if(Character.isDigit(ch)){
                    digitCount++;
                }
            }

            System.out.println("Letter count: "+letterCount+ "; digit count: "+digitCount);
        } while(letterCount<5||digitCount<5);

        scan.close();
    }
}
