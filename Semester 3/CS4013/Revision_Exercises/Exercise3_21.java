//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Scanner;

public class Exercise3_21{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012):");
        int year = scan.nextInt();
        System.out.println("Enter month: 1-12:");
        int month = scan.nextInt();
        System.out.println("Enter the day of the month: 1-31:");
        int day = scan.nextInt();

        //formula and necessary adjusments
        if(month == 1){
            month = 13;
            year = year - 1;
        }else if(month == 2){
            month =14;
            year = year - 1;
        }
        int k = year%100;
        int j = year/100;
        int h = (day + ((26 * (month + 1)) / 10 ) + k + k/4 + j/4 + 5*j)%7;

        //switch statement used to select day for when printing to terminal
        String nameOfDay = "";
        switch(h){
             case 0:
                 nameOfDay = "Saturday";
                 break;
             case 1:
                 nameOfDay = "Sunday";
                 break;
             case 2:
                 nameOfDay = "Monday";
                 break;
             case 3:
                 nameOfDay = "Tuesday";
                 break;
             case 4:
                 nameOfDay = "Wednesday";
                 break;
             case 5:
                 nameOfDay = "Thursday";
                 break;
             case 6:
                 nameOfDay = "Friday";
                 break;
        }
        System.out.println("Day of the week is " + nameOfDay);
    }
}