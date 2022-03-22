public class ForAndWhile {
    public static void main(String[] args) throws Exception{
        System.out.println("This program demonstrates understanding of for & while loops by counting from 10 to 1 and back to 10.");
        int i=1;

        for(i=10;i>=1;i--){
            System.out.println(i);
        }

        while(i<10){
            System.out.println(i);
            i++;
        }
    }
}
