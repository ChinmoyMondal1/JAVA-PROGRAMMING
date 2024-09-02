import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        //Creating a Scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        //Creating a string variable for user input
        String word = sc.nextLine();
        String newword = word.toLowerCase();
        String newword1 = newword.replaceAll("\\s"," ") ;
        int i = newword1.length()-1;
        String rev="";
        for(;i>=0;i--){
            System.out.println(newword1.charAt(i));
           rev=rev + newword1.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(newword1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
