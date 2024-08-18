package Atelier1;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        jeux();
    }

    static void jeux(){
        int joueur = 0;
        int temp = 0;
        int fois = 0;

        while(true){
            Scanner sc = new Scanner(System.in);
            int i1 = (int)(Math.random()*100)+1;
            System.out.println("Ordinateur: "+i1);
            System.out.println("======================");

            while (temp < 5) {

                System.out.print("Saisir un entier entre 0 et 100: ");
                joueur = sc.nextInt();
                while ( joueur <0 || joueur >100) {
                    System.out.print("Saisir un entier entre 0 et 100: ");
                    joueur = sc.nextInt();
                }

                if(joueur < i1) {
                    System.out.println("La aleur saisi est petite");
                } else if (joueur > i1) {
                    System.out.println("La aleur saisi est grande");
                }else {
                    System.out.println("Congrats, la valeur est "+i1);
                    break;
                }
                temp++;
                System.out.println("Il vous reste "+(5-temp)+" tentatives!");


            }
            if (joueur == i1 || temp == 5) {
                fois++;
                System.out.println("To continue tap 1, else 0:");
                int tryAgain = sc.nextInt();
                if (tryAgain == 0) {
                    System.out.println("Vous avez jouer "+fois);
                    break;
                }else{
                    temp = 0;
                }
            }
        }

    }
}
