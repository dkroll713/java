package src;
import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        String phrase;
        char ch;
        int countSpace=0,wordCount=0;

        System.out.print("Please enter a phrase: ");
        phrase=scan.nextLine();
        phrase=phrase.trim();

        for(int i=0;i<phrase.length();i++){
            ch=phrase.charAt(i);
            if(ch==' '){
                countSpace++;
            }
        }
        wordCount=countSpace+1;
        System.out.println("This phrase has "+countSpace+" spaces.");
        System.out.println("This phrase has "+wordCount+" words.");

        scan.close();
    }
}
