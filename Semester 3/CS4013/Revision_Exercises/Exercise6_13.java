//ID: 21307377
//NAME: Gabriel Stan
//MODULE: CS4013
public class Exercise6_13 {
    public static void main(String[] args) {
        getRandom(1,2,3);
    }

    public static int getRandom(int... numbers){
        int num = (int) (Math.random() * 53 + 1);
        int check = numbers.length;
        //checks if the number is one of the ones passed in
        while(check == numbers.length) {
            check = 0;
            num = (int) (Math.random() * 53 + 1);
            for (int passNum : numbers) {
                if (num == passNum) {
                    check = numbers.length;
                }
            }
        }
        return num;
    }
}
