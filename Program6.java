import java.sql.SQLOutput;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your marks in Maths");
        int maths = sc.nextInt();
        System.out.println("Enter your marks in English");
        int eng = sc.nextInt();
        System.out.println("Enter your marks in Science");
        int sci = sc.nextInt();
        int per = (maths + eng + sci)/3;
        System.out.println("Hi " + name + " you're total percentage is " + per);
    }
}
