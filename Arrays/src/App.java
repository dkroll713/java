import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] someNums=new int[10];
        int sub;
        for(int i=0;i<someNums.length;i++){
            System.out.print(someNums[i]+" ");
        }
        for(sub=0;sub<5;sub++){
            someNums[sub]+=3;
        }
        System.out.println();
        for(int i=0;i<someNums.length;i++){
            System.out.print(someNums[i]+"");
        }
        
        int[] myArr=new int[10];
        int index;

        try (Scanner scan = new Scanner(System.in)) {
            for(index=0;index<myArr.length;index++){
                System.out.println("Please enter a value for the array: ");
                myArr[index]=scan.nextInt();
            }
        }

        for(index=0;index<myArr.length;index++){
            System.out.print(myArr[index]);
            System.out.print(", ");
        }
    }
}
