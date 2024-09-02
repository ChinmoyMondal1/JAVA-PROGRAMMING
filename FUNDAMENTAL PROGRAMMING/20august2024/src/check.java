import java.util.*;
public class check {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");

        int num = sc.nextInt();
        String check = (num>100)? "Greater than 100" : "Not greater than 100";
        System.out.println(check);
    }
}
