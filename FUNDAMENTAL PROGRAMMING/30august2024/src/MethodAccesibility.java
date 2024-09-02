import java.util.Scanner;

public class MethodAccesibility {
    static int result,result1 ;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        result = Sum(a,b);

        System.out.println("The sum is : " + result);
        System.out.println("The product is : " + Product(a,b));
    }
    public static int Sum(int a, int b){
        return a+b;
    }
    public static int Product(int a, int b){
         result = a*b;
        return result;
    }
}
