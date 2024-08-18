package Atelier1;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("a= ");
        a = scanner.nextInt();
        System.out.println("\nb= ");
        b = scanner.nextInt();
        int puiss = puissance(a,b);
        System.out.println("\na^b = " + puiss);
    }

    static int puissance(int a, int b) {
        return (int) Math.pow(a,b);
    }
}
