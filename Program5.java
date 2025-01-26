import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int len = sc.nextInt();
        System.out.println("Enter the width of the rectangle");
        int bred = sc.nextInt();
        int peri = 2 * (len + bred);
        int area = len * bred;
        System.out.println("The area of the rectangle is " + area + " and the preimeter is " + peri);
    }
}
