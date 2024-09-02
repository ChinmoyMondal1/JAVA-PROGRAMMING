import java.util.*;
public class program5 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        //Creating a variable for user input
        int num =sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}
