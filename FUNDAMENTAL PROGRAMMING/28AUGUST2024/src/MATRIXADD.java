import java.util.Scanner;

public class MATRIXADD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the first matrix");
        int arr[][] = new int[2][2];
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        int arr1[][] = new int[2][2];
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int arr2[][] = new int[2][2];

        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                arr2[i][j] = arr1[i][j] +arr[i][j];
            }
        }
        System.out.println("The sum matrix is : ");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
