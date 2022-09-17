//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Scanner;

public class Exercise5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        //display largest number
        displayLargestNumber(num1, num2, num3);
    }

    //used to find largest number from 3 numbers
    public static void displayLargestNumber(double num1, double num2, double num3){
        double large1 = Math.max(num1, num2);
        double large2 = Math.max(num2, num3);
        double largeFinal = Math.max(large1, large2);
        System.out.println(largeFinal);
    }
}
