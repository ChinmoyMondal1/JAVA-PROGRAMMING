import java.util.Scanner;

public class sumofdigits {
    public static void main(String args[]){
        //creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        //Creating a variable for user input
        int num = sc.nextInt();
        int rem, sum=0;

        //Working
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The sum of the digits of the number is : " + sum);

    }
}
