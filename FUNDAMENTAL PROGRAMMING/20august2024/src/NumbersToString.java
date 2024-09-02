import java.util.*;
public class NumbersToString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to be added");

        String number1 = sc.next();
        String number2 = sc.next();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int sum = num1+num2;
        System.out.println("The Sum is : " + sum);
    }
}
