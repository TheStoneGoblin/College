//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Scanner;

public class Exercise2_13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        double money = scan.nextDouble();
        double sum = money * 1.00417;
        //used to iterate 5 times through the equation as, when initializing the sum we already calculated the first time
        for(int i = 0; i < 5; i++){
            sum = (money + sum) * 1.00417;
        }
        System.out.println("After six months , the account value is $" + sum);
    }
}