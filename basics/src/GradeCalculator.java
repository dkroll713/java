import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);

        double score;
        System.out.print("Please enter your score: ");
        score=scan.nextDouble();
        String grade="";

        if(score<60){
            grade="F";
        } else if(score>=60 && score<70){
            grade="D";
        } else if(score>=70 && score<80){
            grade="C";
        } else if(score>=80 && score<90){
            grade="B";
        } else {
            grade="A";
        }
        System.out.printf("Your letter grade is: %s",grade);

        scan.close();
    }
}
