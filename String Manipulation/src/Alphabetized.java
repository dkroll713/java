package src;

public class Alphabetized {
    public static void main(String[] args) throws Exception{
        String word1,word2;
        word1="Hello";
        word2="Hello";

        int comparison=word1.compareTo(word2);
        System.out.print(word1.compareTo(word2));

        if(comparison>0){
            System.out.print("\nThe words are not alphabetized");
        } else {
            System.out.print("\nThe words are alphabetized.");
        }
    }
}
