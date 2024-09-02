import java.util.Scanner;

public class Calculator {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the choice : \n 1. Add \n 2. Substract \n 3.multiply \n 4.division");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                int sum = a+b;
                System.out.println("The sum is : "+ sum);
                break;
                case 2:
                int sub = a-b;
                System.out.println("The sum is : "+ sub);
                break;
                case 3:
                int pro = a*b;
                System.out.println("The sum is : "+ pro);
                break;
                case 4:
                int div = a/b;
                System.out.println("The sum is : "+ div);
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}
