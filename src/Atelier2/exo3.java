package Atelier2;

public class exo3 {
    public static void main(String[] args) {
        char[] T = {'a','b','c','d','e','f','g','h'};
        System.out.println("New array with random chars");
        char[] a = aleatoire(T);
        for(char k : a){
            System.out.print(k + " ");
        }
    }

    static char[] aleatoire(char[] T){
        char[] a = T.clone();// Clone the array to avoid modifying the original array
        for (int i = T.length-1; i > 0 ; i--){
            int j = (int) (Math.random() * (i+1)); // Generate a random index [0,i]

            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}
