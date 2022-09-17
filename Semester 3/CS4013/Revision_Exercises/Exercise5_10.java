//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
import java.util.ArrayList;

public class Exercise5_10 {
    public static void main(String[] args) {
        ArrayList<Integer> primeNums = new ArrayList<>();
        int check = 0;
        for(int i = 1; i < 20000; i++){
            for (int j = 2; j < i/2; j++) {
                if(i % j == 0){
                    check = 1;
                }
            }
            if(check == 0 && i != 1 && i != 4){
                primeNums.add(i);
            }
            check = 0;
        }
        System.out.println(primeNums.size());
    }
}
