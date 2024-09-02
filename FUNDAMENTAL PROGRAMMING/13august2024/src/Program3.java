import java.util.*;
public class Program3 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        // Creating a variable for user input
        int a = sc.nextInt();

        //Working
        if(a>0){
            System.out.println("The number " + a + " is positive");
        }
        else if(a<0){
            System.out.println("The number " + a + " is negitive");
        }
        else{
            System.out.println("The number " + a + " is zero");
        }
    }
}
