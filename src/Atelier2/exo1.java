package Atelier2;

//import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 3};
        if (isArrayIn(arr1,arr2)){
            System.out.println("Yess Arr1 includes in Arr2 ");
        }else{
            System.out.println("Nooooo!");
        }
    }
    static boolean isArrayIn(int[] arr1, int[] arr2) {
        for (int i = 0; i <= arr2.length - arr1.length; i++) {
            boolean match = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i + j] != arr1[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}
/*
Input:
    arr2 = {1, 2, 3, 4, 5};
    arr1 = {2, 3};
Output:
    True
Input:
    arr2 = {1, 2, 3, 4, 5};
    arr1 = {2, 4};
Output:
    false
*/