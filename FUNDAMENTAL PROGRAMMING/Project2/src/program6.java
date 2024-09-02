import java.util.Scanner;

public class program6 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to find its factorial");
        //Creating a variable for user input
        int a = sc.nextInt();
        int i;
        int pro=1;
        for(i=a;i>0;i--){
            pro = pro * i;
        }
        System.out.println("The Factorial is : " + pro);
    }
}
