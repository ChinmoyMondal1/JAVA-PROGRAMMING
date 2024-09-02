import java.util.*;
public class Program1 {
    public static void main(String args[]){
        //Creating a Scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        //Creating a variable for user input
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Working
        if(a==b){
            System.out.println("Number1 and Number2 are equal");
        }
        else{
            System.out.println("Number1 and Number2 are not equal");
        }
    }
}
