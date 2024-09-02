import java.util.*;
public class Fullname {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstname");
        String firstname = sc.next();
        System.out.println("Enter the lastname");
        String lastname = sc.next();

        System.out.println("You full name is : " + firstname + " " +lastname);
    }
}
