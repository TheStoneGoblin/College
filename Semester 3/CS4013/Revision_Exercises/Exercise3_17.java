//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Scanner;

public class Exercise3_17{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("scissors(0), rock(1), paper(2)");
        int humanPick = scan.nextInt();

        int robotPick = (int) (Math.random() * 3);
        String robot = "";
        String human = "";
        //switch statements used to assign Strings for when outputting with printf in the game end selector
        switch(robotPick){
            case 0: 
                robot = "scissor";
                break;
            case 1:
                robot = "rock";
                break;
            case 2:
                robot = "paper";
                break;
        }
        switch(humanPick){
            case 0: 
                human = "scissor";
                break;
            case 1:
                human = "rock";
                break;
            case 2:
                human = "paper";
                break;
        }
        //select game end
        if(humanPick == 0 && robotPick == 2 || 
           humanPick == 1 && robotPick == 0 ||
           humanPick == 2 && robotPick == 1){
            System.out.printf("The computer is %s. You are %s. You won \n", robot, human);
            }else if(humanPick == 0 && robotPick == 1 || 
                     humanPick == 1 && robotPick == 2 ||
                     humanPick == 2 && robotPick == 0){
                        System.out.printf("The computer is %s. You are %s. The computer won \n", robot, human);
                        }else{
                        System.out.printf("The computer is %s. You are %s. It is a draw \n", robot, human);
                        }
    }
}