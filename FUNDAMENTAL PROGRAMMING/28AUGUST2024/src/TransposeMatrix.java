import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int temp;
        System.out.println("Enter the matrix(First rows )");
        int arr[][] = new int[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){

                System.out.print(arr[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
