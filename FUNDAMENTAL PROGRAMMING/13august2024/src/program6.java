import java.util.*;
public class program6 {
    public static void main(String args[]){
        //Creating a scanner obj
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number and find its corresponding m value");
        //Creating a variable for user input
        int n =sc.nextInt();
        int m;
        //Working
        if(n>0){
            m=1;
        }
        else if(n<0){
            m=-1;
        }
        else{
            m=0;
        }
        System.out.println("the m value is : " + m);
    }
}
