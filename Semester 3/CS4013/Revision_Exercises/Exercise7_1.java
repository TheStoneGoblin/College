//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Scanner;

public class Exercise7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3x4 matrix row by row :");
        double[][] matrix = new double[3][4];
        //scan the rows as strings
        String row1 = scan.nextLine();
        String row2 = scan.nextLine();
        String row3 = scan.nextLine();
        //concatenate the rows into one String
        String matrixS = row1 +" "+ row2+" "+row3;
        //split Strings into an array
        String[] matrixSSplit = matrixS.split(" ");
        double[] matrix1D = new double[12];

        //used to form the 1D matrix from the array String of numbers
        for (int i = 0; i < matrix1D.length; i++) {
            matrix1D[i] = Double.parseDouble(matrixSSplit[i]);
        }

        //used to form final matrix from matrix1D
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix1D[count];
                count++;
            }
        }

        //used to print out matrix on screen
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //used to calculate the sum of each column and print it out on the screen
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            System.out.printf("Sum of the elements at column %d is %d \n", i, sum);
            sum = 0;
        }
    }
}
