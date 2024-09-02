import java.util.Scanner;

public class MinutesConversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes");
        int minutes = sc.nextInt();

        int year = minutes/525600;
        System.out.println("Years " + year);

        int days = minutes/1440;
        System.out.println("Days " + days);
    }
}
