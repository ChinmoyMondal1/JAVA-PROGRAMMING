import java.util.Scanner;

public class typecast1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        double a = sc.nextDouble();
        int b =(int) a;
        System.out.println(b);
    }
}
