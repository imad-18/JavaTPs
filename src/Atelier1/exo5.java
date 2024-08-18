package Atelier1;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width = ");
        int width = sc.nextInt();
        System.out.print("Length = ");
        int length = sc.nextInt();
        contour(width, length);
    }
    static void contour(int width, int length) {
        System.out.println("P = ("+width+" + "+length+")*2 = "+(width+length)*2);
    }
}
