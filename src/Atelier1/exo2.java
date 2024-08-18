package Atelier1;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("n= ");
        n = sc.nextInt();
        while(n <= 0){
            System.out.println("Saisir un entier positif: ");
            n = sc.nextInt();
        }
        int fct = somme(n);
        System.out.println("La somme des n 1iers entiers = "+fct);
    }

    static int somme(int n){
        int sum = 0;

        for(int i=0 ; i <= n ; i++){
            if(i % 2 != 0){
                sum+=i;
            }
        }
        return sum;
    }
}
