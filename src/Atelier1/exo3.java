package Atelier1;
import java.util.Scanner;
//nombre parfaits
public class exo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-->Saisir un entier: ");
        int n = sc.nextInt();
        boolean myFct = parfait(n);
        if(myFct){
            System.out.println(n + " est parfait.");
        }else{
            System.out.println(n + " n'est pas parfait.");
        }
        System.out.println("-->Les entiers parfaites entre 1 et 1000 sont:");
        fct2();

    }
    static boolean parfait(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum+=i;
            }
        }
        return sum == n;
    }
    static void fct2() {
        for (int i = 1; i < 1000; i++) {
            if (parfait(i)) {
                System.out.println(i + " est parfait.");
            }
        }

    }

}
