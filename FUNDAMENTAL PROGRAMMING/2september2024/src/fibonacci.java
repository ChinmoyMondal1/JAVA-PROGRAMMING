import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = fact(num);
        System.out.println("The factorial is : "  + sum);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}
