/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4222
 */
public class ImageDriver{
    public static void main(String []args){
        int h = (int)(Math.random() * 9 +1);
        int w = (int)(Math.random() * 9 +1);
        Image Array = new Image(ArrayCreator(h, w));

        System.out.println(Array.toString());

        Array.flip(true);
        System.out.println(Array.toString());
        
        Array.flip(false);
        System.out.println(Array.toString());
        
        Array.flip(true);
        Array.flip(false);
        System.out.println(Array.toString());
        
        Array.rotate(true);
        System.out.println(Array.toString());
        
        Array.rotate(false);
        System.out.println(Array.toString());
        
        Array.rotate(true);
        Array.rotate(true);
        Array.rotate(true);
        Array.rotate(true);
        System.out.println(Array.toString());
    }

    public static int[][] ArrayCreator(int h, int w){
        int[][] testArray = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                testArray[i][j] = (int)(Math.random() * 100 +1);
            }
        }
        return testArray;
    }
}
