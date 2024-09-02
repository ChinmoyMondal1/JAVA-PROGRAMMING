import java.util.*;
public class program4 {
    public static void main(String args[]){
        //Creating a new scanner obj
        System.out.println("To find the maximum of them");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers ");
        //Creating variables for user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Working Starts
        if(a>b && a>c){
            System.out.println(a + " is maximum");
        }
        else if(b>a && b>c){
            System.out.println(b + " is maximum");
        }
        else{
            System.out.println(c+" is maximum");
        }
    }
}
