package Atelier2;

import java.util.Scanner;

public class exo2V2 {
    public static void main(String[] args) {
        System.out.println("\n------------3rd method------------");
        int[] T1 = new int[3];
        int[] T2 = new int[3];
        int sum = 0;

        System.out.println("1st array:");
        fillArray(T1);
        System.out.println("2nd array:");
        fillArray(T2);

        for (int value : T2) {  //get the length of the new arr T3
            sum += value;
        }
        int[] T3 = new int[sum];

        System.out.print("T1 = ");
        printArray(T1);
        System.out.print("\nT2 = ");
        printArray(T2);
        System.out.print("\nT3 = ");
        exo2.arrayDup(T1, T2, T3);
    }
    static void fillArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Saisir la valeur T["+(i+1)+"] : ");
            array[i] = sc.nextInt();
        }

    }
    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value+ " ");
        }
    }

}
