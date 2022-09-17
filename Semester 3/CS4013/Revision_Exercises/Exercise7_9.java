//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.Scanner;

public class Exercise7_9 {
    private static final String[][] ticTac = new String[3][3];
    /*

    game states
    game = 3 -game ongoing
    game = 0 -draw
    game = 1 -player 1(X) has won
    game = 2 -player 2(O) has won

     */
    private static int game = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < ticTac.length; i++){
            for (int j = 0; j < ticTac[i].length; j++) {
                ticTac[i][j] = " ";
            }
        }
        int row = 0;
        int col = 0;
        int player = 1;
        int exists = 1;
        while(game == 3){
            //collect choice from player
            System.out.printf("Enter a row(0, 1, 2) for player %d: ", player);
            row = scan.nextInt();
            System.out.printf("Enter a col(0, 1, 2) for player %d: ", player);
            col = scan.nextInt();
            //check of place is not occupied, if no make player pick something else, if yes move on with the game
            if(ticTac[row][col].equals(" ")){
                ticTac(row, col, player);
                //switch between players
                if(player == 1){
                    player = 2;
                }else{
                    player = 1;
                }
            }else{
                //statement for occupied cell
                System.out.println("Space already occupied, enter another space please");
            }
        }

        //printout for different game ends
        if(game == 0){
            System.out.println("It's a draw!");
        }else if(game == 1){
            System.out.println("Player 1 has own!");
        }else if(game == 2){
            System.out.println("Player 2 has won!");
        }
    }

    public static void ticTac(int row, int col, int player){
        //place X or O in right place on board
        if(player == 1){
            ticTac[row][col] = "X";
        }else{
            ticTac[row][col] = "O";
        }

        //print board to screen
        System.out.printf("_____________\n"+
                          "| %S | %S | %S |\n"+
                          "| %S | %S | %S |\n"+
                          "| %S | %S | %S |\n"+
                          "-------------\n", ticTac[0][0],ticTac[0][1],ticTac[0][2],ticTac[1][0],ticTac[1][1],ticTac[1][2],ticTac[2][0],ticTac[2][1],ticTac[2][2]);
        int count = 0;

        //arrange all possible win conditions for easier calculation of the win
        for (int i = 0; i < 8; i++) {
            String line = "";
            switch (i) {
                case 0:
                    line = ticTac[0][0] + ticTac[0][1] + ticTac[0][2];
                    break;
                case 1:
                    line = ticTac[1][0] + ticTac[1][1] + ticTac[1][2];
                    break;
                case 2:
                    line = ticTac[2][0] + ticTac[2][1] + ticTac[2][2];
                    break;
                case 3:
                    line = ticTac[0][0] + ticTac[1][0] + ticTac[2][0];
                    break;
                case 4:
                    line = ticTac[0][1] + ticTac[1][1] + ticTac[2][1];
                    break;
                case 5:
                    line = ticTac[0][2] + ticTac[1][2] + ticTac[2][2];
                    break;
                case 6:
                    line = ticTac[0][0] + ticTac[1][1] + ticTac[2][2];
                    break;
                case 7:
                    line = ticTac[0][2] + ticTac[1][1] + ticTac[2][0];
                    break;
                }
                //check for win
                if(line.equals("XXX")){
                    game = 1;
                }else if(line.equals("OOO")){
                    game = 2;
                }
                //count check for draw
            for (int j = 0; j < ticTac.length; j++) {
                for (int k = 0; k < ticTac[j].length; k++) {
                    if(!ticTac[j][k].equals(" ")){
                        count++;
                    }
                }
            }
            //check for draw
            if(count == 9){
                game = 0;
            }else{
                count = 0;
            }
        }
    }
}
