import java.util.*;
public class program8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers a,b and c");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String message;
        message =  (a>b && a>c)? "A is greatest" : (b>a && b>c)? " B is greatest" : "C is greatest";
        System.out.println(message);
    }
}
