import java.util.Scanner;

public class longtobyte {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        long a = sc.nextLong();

        byte b = (byte) a;
        System.out.println(b);
    }
}
