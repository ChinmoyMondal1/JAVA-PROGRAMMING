import java.util.*;
public class program9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates");

        int a = sc.nextInt();;
        int b = sc.nextInt();;

        if(a>0 && b > 0){
            System.out.println("The coordinates lies in quadrant 1");
        }
        else if(a>0 && b < 0){
            System.out.println("The coordinates lies in quadrant 2");
        }else if(a<0 && b < 0){
            System.out.println("The coordinates lies in quadrant 3");
        }
        else if(a<0 && b >0){
            System.out.println("The coordinates lies in quadrant 4");
        }
        else{
            System.out.println("The coordinate is origin");
        }
    }
}
