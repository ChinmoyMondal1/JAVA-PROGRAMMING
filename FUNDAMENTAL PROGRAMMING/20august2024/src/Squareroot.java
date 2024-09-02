import java.util.*;
import java.math.*;

public class Squareroot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");

        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        System.out.println("The square root is : " + sqrt);
    }
}
