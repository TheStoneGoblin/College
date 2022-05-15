/*
ID:     21307377
Name:   Gabriel Stan
Module: CS4222
 */
import java.util.Arrays;
import java.util.*;
public class Image{
    private int[][] pixels;
    private int width;
    private int height;
    public Image(int[][] pixels){
        this.pixels = pixels;
        this.height = pixels.length;
        this.width = pixels[0].length;
    }

    public String toString(){
        return Arrays.deepToString(pixels);
    }

    public void flip(boolean horizontal){
        if(horizontal){
            int temp;
            for(int i = 0; i < height; i++){
                for(int j = 0; j < width / 2; j++){
                    temp = pixels[i][j];
                    pixels[i][j] = pixels[i][width - 1 - j];
                    pixels[i][width - 1 - j] = temp;
                }
            }
        }else{
            int[] arrayTemp;
            for(int i = 0; i < height / 2; i++){
                arrayTemp = pixels[i];
                pixels[i] = pixels[(height - 1 - i)];
                pixels[(height - 1 - i)] = arrayTemp;
            } 
        }
    }

    public void rotate(boolean clockwise){
        int[][] arrayTemp = new int[width][height];
        if(clockwise){
            for(int i = 0 ; i < height; i++){
                for(int j = 0; j < width; j++){
                    arrayTemp[j][height - 1 - i] = pixels[i][j];
                }
            }
        }else{
            for(int i = 0 ; i < height; i++){
                for(int j = 0; j < width; j++){
                    arrayTemp[width - 1 - j][i] = pixels[i][j];
                }
            }
        }

        this.pixels = arrayTemp;
        int newWidth = height;
        int newHeight = width;
        this.width = newWidth;
        this.height = newHeight;
    }
}
