import java.util.Scanner;

public class program7 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to be multiplied");
        //Creating a variable for user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro;
        pro= a*b;
        System.out.println("The Product is : " + pro);

    }
}
