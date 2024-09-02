import java.util.*;
public class Program1 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        //Creating a String variable for user inp
        String word = sc.next();
        int i=word.length()-1;
        //Working
        for(;i>=0;i--){
            System.out.print(word.charAt(i));
        }

    }
}
