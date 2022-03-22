import student.student;
import java.util.Scanner;

public class CreateStudents {
    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        student stu=new student();

        System.out.print("Please input a student id: ");
        stu.setStudentID(scan.nextInt());
        scan.close();

        System.out.println(stu.getStudentID());
    }
}
