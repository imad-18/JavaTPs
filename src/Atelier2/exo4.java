package Atelier2;

public class exo4 {
    public static void main(String[] args) {
        String s = "unechaine";
        String newS = chaine(s);
        System.out.println("Newww: "+newS);

    }
    public static String chaine(String s) {

        StringBuffer sb=new StringBuffer(s);
        for(int i=0 ; i < sb.length() ; i++) {
            char c = sb.charAt(i);
            System.out.println(c);
            sb.setCharAt(i , sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1 , c);
        }
        return sb.toString();
    }
}
