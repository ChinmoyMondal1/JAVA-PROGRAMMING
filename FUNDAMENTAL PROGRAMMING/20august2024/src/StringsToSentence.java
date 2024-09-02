import java.util.*;
import java.util.Scanner;

public class StringsToSentence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentences in different words(Enter only 5 words now)");
        String word1= sc.next();
        char word = word1.charAt(0);
        String capitalize = Character.toUpperCase(word) + word1.substring(1);
        String word2= sc.next();
        String word3= sc.next();
        String word4= sc.next();
        String word5= sc.next();

        System.out.println("The sentence made through these words is : " + capitalize + " " + word2 + " " + word3 + " " + word4 + " " + word5+ ".");

    }
}
