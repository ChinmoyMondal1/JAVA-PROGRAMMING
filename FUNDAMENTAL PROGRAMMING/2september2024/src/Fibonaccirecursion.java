import java.util.Scanner;

public class Fibonaccirecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int num = sc.nextInt();
        System.out.println("Fibonacci numbers are : "+ fibonacci(num));
    }
    public static int fibonacci(int n){
        if(n==0 ){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
