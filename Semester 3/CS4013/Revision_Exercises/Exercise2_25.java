//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.*;

public class Exercise2_25{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = scan.nextLine();
        System.out.println("Enter number of hours worked in a week:");
        double hours = scan.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double payRate = scan.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double fed_tax = scan.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double state_tax = scan.nextDouble();
        //calculate necessary values
        String fed = "(" + fed_tax * 100 + "%): $";
        String state = "(" + state_tax * 100 + "%): $";
        double grossPay = hours*payRate;
        double fedHold = grossPay * fed_tax;
        double stateHold = grossPay * state_tax;
        //print out the required values
        System.out.println("Employee Name: " + name + "\n" +
                           "Hours worked:  " + hours + "\n" +
                           "Pay rate:      $" + payRate + "\n" +
                           "Gross pay:     $" + grossPay + "\n" +
                           "Deductions:" + "\n" +
                           "   Federal Withholding " + fed + fedHold + "\n" +
                           "   State Withholding " + state + stateHold + "\n" +
                           "   Total Deduction:  $" + fedHold + stateHold + "\n" +
                           "Net Pay:   $" + (grossPay - fedHold - stateHold) + "\n");
    }
}