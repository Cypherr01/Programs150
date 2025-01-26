import java.util.Scanner;

public class Program7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        int far = sc.nextInt();
        int cel = ((far - 32)*5)/9;
        System.out.println("The temperature in Celcius is " + cel);
    }
}
