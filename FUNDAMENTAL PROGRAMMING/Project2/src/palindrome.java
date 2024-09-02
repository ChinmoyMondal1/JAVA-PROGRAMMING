import java.util.*;
public class palindrome {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Palindrome check");
        //Creating a variable for user input
        int num = sc.nextInt();
        int rem, rev=0, temp;
        temp=num;
        //Working
        while(num>0){
            rem = num%10;
            rev= rev*10 +rem;
            num = num/10;
        }
        if(rev==temp){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is not Palindrome");
        }
    }
}
