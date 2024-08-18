package Atelier1;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un entier: ");
        int n = sc.nextInt();
        if (premier(n)){
            System.out.print(n + " est premier");
        }else{
            System.out.print(n + " n'est pas premier");
        }
        //2ème modification
        System.out.println("\nSaisir 2 entiers:");
        System.out.print("n1= ");
        int n1 = sc.nextInt();
        System.out.print("n2= ");
        int n2 = sc.nextInt();
        System.out.println("les entiers premiers entre"+n1+" et "+n2+" sont:");
        premier2(n1,n2);
    }
    static boolean premier(int n){
        boolean gara = true;
        for(int i = 2 ; i < n ; i++){
            if (n % i == 0) {
                gara = false;
                break;
            }
        }
        return gara;
    }

    static void premier2(int n1, int n2){
        for(int i = n1 ; i < n2 ; i++){
            if(premier(i)){
                System.out.println(i + " est premier");
            }
        }
    }
}
