import java.util.*;
public class program9 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        //Creating a variable for user input
        int num = sc.nextInt();
        int rev=0, rem;

        //Working
        while(num>0){
            rem=num % 10;
            rev= rev *10 + rem;
            num = num/10;
        }
        System.out.println("The reversed number is : " + rev);
    }
}
