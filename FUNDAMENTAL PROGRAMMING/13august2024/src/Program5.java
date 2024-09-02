import java.util.*;
public class Program5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        //Creating the variable for user input
        int age= sc.nextInt();

        //Working
        if(age>=18){
            System.out.println("Congratulations! You are eligible for casting your vote");
        }
        else{
            System.out.println("Sorry! You cannot cast your vote");
        }
    }
}
