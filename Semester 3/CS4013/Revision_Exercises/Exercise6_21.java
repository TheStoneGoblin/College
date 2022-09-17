//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Arrays;
import java.util.Scanner;

public class Exercise6_21 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter number of balls to be drop:");
        int balls = scan.nextInt();
        System.out.println("Enter the number of slots in the bean machine:");
        int slots = scan.nextInt();
        String path = "";
        int slotCount = 0;
        int[] slotNumber = new int[slots];

        //used to randomly pick the bounce of the ball R- for right and L- for left
        for(int i = 1; i <= balls; i++){
            for (int j = 1; j < slots; j++) {
                if(Math.random() < 0.5){
                    path += "L";
                }else{
                    path += "R";
                    slotCount++;
                }
            }
            System.out.println(path);
            path = "";
            //used to store the number of bounces in the Right direction for easier calculations for the histogram
            slotNumber[slotCount] += 1;
            slotCount = 0;
        }

        //used to find the max height of the histogram
        int[] sortingSlotNumber =  Arrays.copyOf(slotNumber, slotNumber.length);
        Arrays.sort(sortingSlotNumber);
        int height = sortingSlotNumber[sortingSlotNumber.length - 1];

        //used to print out histogram
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < slotNumber.length; j++) {
                if(slotNumber[j] >= i){
                    System.out.print(0);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
