import java.util.*;
public class Program4 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to be checked");
        //Creating the variable for user input
        int a = sc.nextInt();

        //Working
        if(a%4==0) {
            if (a > 100) {
                if (a % 100 == 0 && a % 400 == 0 || a%4==0) {
                    System.out.println("The year is a leap year");
                } else {
                    System.out.println("The year is not a leap year");
                }
            } else {
                System.out.println("The year is a leap year");

            }
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}

