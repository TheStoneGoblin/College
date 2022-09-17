//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Scanner;

public class Exercise4_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        int finalSum = 0;
        //used to calculate actual sum
        for(int n = scan.nextInt(); n > 0; n--){
            finalSum += sum(n);
        }
        System.out.println(finalSum);
    }

    //used to calculate 1+2+3+...+n
    public static int sum(int number) {
        if(number > 1){
            return number + sum(number - 1);
        }else{
            return 1;
        }

    }
}
