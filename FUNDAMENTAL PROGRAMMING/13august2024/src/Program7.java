import java.util.*;
public class Program7 {
    public static void main(String args[]){
        //Scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm");
        //Creating a variable for user input
        int height = sc.nextInt();

        //working
        if(height<150){
            System.out.println("You are dwarf, Buy a complan");
        }
        else if(height>=150 && height<=165){
            System.out.println("You are average");
        }
        else{
            System.out.println("You are Tall, Rub the blackboard everytime");
        }
    }
}
