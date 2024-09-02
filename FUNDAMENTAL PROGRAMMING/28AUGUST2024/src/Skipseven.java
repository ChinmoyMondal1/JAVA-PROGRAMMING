import java.util.Scanner;

public class Skipseven {
    public static void main(String args[]) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int i;
        int count = 0;
        for (i = 1; i <= range; i++) {
            if(i==7){
                continue;
            }
            else {
                count++;
            }
           // System.out.println(i);
        }
        System.out.println(count);
    }
}
