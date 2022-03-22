import java.util.Scanner;

public class Names {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        String name;

        System.out.println("Please enter your name: ");
        name=scan.nextLine();

        System.out.println("Your name is "+name);

        char ch;
        ch=name.charAt(0);
        System.out.println(ch);

        if(Character.isUpperCase(ch)){
            System.out.println("The first letter is capitalized.");
        }
        System.out.println(name.length());
        System.out.println(name.indexOf("a"));
        System.out.println(name.endsWith("ab"));

        if(name.startsWith("A") && name.endsWith("c")){
            System.out.println(name.replace('a','A'));
        }

        scan.close();
    }
}
