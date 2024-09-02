import java.util.*;
public class program8 {
    public static void main(String args[]){
        //Creating a Scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to be checked");
        //Creating a variable for user input
        int year = sc.nextInt();

        //Working
        if(year%4==0) {
            if (year > 100 && year % 400 == 0 && year%100==0 ){
                System.out.println("This is a leap Year");
            }
            else if (year<100) {
                System.out.println("This is a leap year");
            }



        }
        else{
            System.out.println("This year is not a leap year");
        }
    }
}
