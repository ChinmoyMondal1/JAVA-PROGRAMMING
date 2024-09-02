import java.util.Scanner;

public class Sumuntilhundred {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want to add");
        int sum =0 ;
        while(true){
            int a = sc.nextInt();
            sum = sum + a;
            if(sum  >= 100){
                System.out.println("100 reached");
                break;
            }
            System.out.println(sum);

        }
    }
}
