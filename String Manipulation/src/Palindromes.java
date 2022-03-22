package src;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);

        String phrase;
        System.out.print("Please enter phrase: ");
        phrase=scan.nextLine().toLowerCase();
        scan.close();

        StringBuilder originalString=new StringBuilder("");
        StringBuilder reverseString=new StringBuilder("");

        int index;
        char ch;
        for(index=0;index<phrase.length();index++){
            ch=phrase.charAt(index);
            if(Character.isLetterOrDigit(ch)){
                originalString.append(phrase.charAt(index));
            }
        }
        System.out.println(originalString);

        for(index=phrase.length()-1;index>=0;index--){
            ch=phrase.charAt(index);
            if(Character.isLetterOrDigit(ch)){
                reverseString.append(ch);
            }
        }
        System.out.println(reverseString);
    }
}
