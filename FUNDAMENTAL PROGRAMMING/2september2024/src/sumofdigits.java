import java.util.Scanner;

public class sumofdigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       int sum = sum(n);
        System.out.println("The sum of digits is : "+sum);

    }
    public static int sum(int num){

        if(num==0){
            return 0;
        }
        else{


            return num%10 + sum(num/10);

        }
    }
}
