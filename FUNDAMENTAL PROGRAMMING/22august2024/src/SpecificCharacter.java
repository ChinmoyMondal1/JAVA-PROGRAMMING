import java.util.Scanner;

public class SpecificCharacter {
    public static void main(String args[]){
        System.out.println("Enter the desired string ");
        Scanner sc = new Scanner(System.in);

        String sentence1 = sc.nextLine();
        String sentence = sentence1.toLowerCase();
        System.out.println("Enter the character to be found(in small letters)");
        char ch = sc.next().charAt(0);


        int length = sentence.length();
        System.out.println(length);
        int i ;
        for(i=0;i<length-1;i++){
            char alpha = sentence.charAt(i);
            if(ch == alpha){
                System.out.println("The character is in index :" + (i+1));
                break;
            }
        }
    }
}