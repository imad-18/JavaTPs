package Atelier2;

public class exo2 {
    public static void main(String[] args) {
        int[] T1 = {2,-3,4};
        int[] T2 = {2,3,2};
        int sum = 0;
        int j = 0;
        for (int value : T2) {  //get the length of the new arr T3
            sum += value;
        }
        arrayDup(T1, T2, sum);
        System.out.println("\n------------2nd method------------");
        arrayDup2(T1, T2, sum);
    }

    static void arrayDup(int[] T1,int[] T2,int sum){
        int[] T3 = new int[sum]; //declare arr T3
        int j = 0;
        int k=0;
        for(int i=0;i<T1.length;i++){
            for(j=0; j<T2[i];j++){
                //System.arraycopy(T1, 0, T3, 0, T1.length);
                T3[k] = T1[i];
                k++;
            }
        }

        for (int i : T3) {
            System.out.print(i + " ");
        }
    }
    static void arrayDup2(int[] T1,int[] T2, int sum){

        int[] T3 = new int[sum]; //declare arr T3
        int j = 0;
        int k=0;
        for(int i=0;i<T1.length;i++){
            for(j=0; j<T2[i];j++){
                System.arraycopy(T1, i, T3, k, 1);
                k++;
            }
        }

        for (int i : T3) {
            System.out.print(i + " ");
        }
    }
}
