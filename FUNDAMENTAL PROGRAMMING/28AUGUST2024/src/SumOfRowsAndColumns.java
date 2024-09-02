import java.util.Scanner;

public class SumOfRowsAndColumns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j;

        System.out.println("Enter the matrix");
        int arr[][] = new int[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Sum of rows and columns
        //sum of row
        for(i=0;i<3;i++){
            int sumrow=0;

            for(j=0;j<3;j++){
                sumrow = sumrow + arr[i][j];
            }
            System.out.println("The sum of row " + i + "is" + sumrow);

        }
        System.out.println("\n");
        for(i=0;i<3;i++){
            int sumcolumn=0;
            for(j=0;j<3;j++){
                sumcolumn = sumcolumn + arr[j][i];
            }
            System.out.println("The sum of column " + i + "is" + sumcolumn);
        }
    }
}
