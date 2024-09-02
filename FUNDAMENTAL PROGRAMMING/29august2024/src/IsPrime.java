import java.util.Scanner;

public class IsPrime {
    public static void main(String args[]){
        System.out.println("Enter the number to be checked");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check=Primecheck(num);
        if(check){
            System.out.println("The number is prime ");
        }
        else{
            System.out.println("Not prime");
        }
    }
    public static boolean Primecheck(int num){
        int i;
        int count =0;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count++;

            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
}
