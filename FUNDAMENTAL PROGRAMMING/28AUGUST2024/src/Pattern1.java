import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = sc.nextInt();
        int i,j;
        for(i=1;i<row;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
