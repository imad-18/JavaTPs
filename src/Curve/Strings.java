package Curve;

public class Strings {
    public static void main(String[] args) {
        System.out.println("--------------Fct1-----------------");
        countWords("hi my bro how're u doing?");
        System.out.println("--------------Fct2: Reverse words-----------------\n");
        reverseWords("hi my bro how're u doing?");
        System.out.println("\n--------------Fct3: Reverse all-----------------\n");
        reverseAll("Hello world");
        System.out.println("\n--------------Fct4: Word Spacing----------------\n");
        insertSpaces("HelloBrothersAndSisters");

    }
    public static void countWords(String str) {
        var words = str.split(" "); //splitting str sentence by spaces
        int count = words.length;
        String message = String.format("Your sentence has %d words",count);
        System.out.println(message);
        for(String word : words){
            System.out.println(word);
        }
        //replacing white spaces with '-'
        String modif2 = String.join("-", words);
        System.out.println(modif2);
    }
    public static void reverseWords(String str) {
        var words = str.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i]+" ");
        }
    }
    public static void reverseAll(String str) {
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
    //This method adds spaces before each uppercase letter in a given string
    public static void insertSpaces(String str) {
        var sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            System.out.println(i);
            if(i != 0 && Character.isUpperCase(sb.charAt(i))){
                sb.insert(i, " ");
                i++;
            }
        }
        System.out.println(sb);
    }
}
