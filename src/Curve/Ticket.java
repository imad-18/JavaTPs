package Curve;

import java.util.Arrays;
import java.util.Random;

public class Ticket {
    public static void main(String[] args) {
        final int length = 6;
        int[] tabeau = new int[length];
        int[] newT = generateNumbers(tabeau);
        printArray(newT);
    }
    public static int[] generateNumbers(int[] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNum;
            do {
                randomNum = rand.nextInt(1,10);
            }while(search(array,randomNum));
            array[i] = randomNum;
        }
        return array;
    }
    public static boolean search(int[] array, int randomNum){
        for(int value : array){
            if(value == randomNum) return true;
        }
        return false;
    }
    public static void printArray(int[] array){
        Arrays.sort(array);
        for(int value : array){
            System.out.print(value + " | ");
        }
    }
}
