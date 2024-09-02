import java.util.Scanner;

public class FindMaximum {
    public static void main(String args[])
    {
        System.out.println("Enter three numbers ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The greatest number is : " + Maximum(a,b,c) );
    }
    public static int Maximum(int x, int y, int z){
        if(x>y && x>z){
            return x;
        }
        else if(y>x && y>z){
            return y;
        }
        else{
            return z;
        }
    }
}
