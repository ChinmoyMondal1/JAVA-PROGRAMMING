import java.util.*;
public class Program2 {
    public static void main(String args[]){
        //Creating a Scanner obj
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to be checked");
        //Creating a variable for user input
        int a = sc.nextInt();

        //Working
        if(a%2==0){
            System.out.println("The number " + a + " is even ");
        }
        else{
            System.out.println("The number " + a + " is odd ");
        }
    }
}
