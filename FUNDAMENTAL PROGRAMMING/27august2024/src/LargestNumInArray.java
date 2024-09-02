import java.util.Scanner;

public class LargestNumInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int i;
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values for the array ");
        for(i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(i=0;i<n;i++){
            if(max < arr[i]){
                max = arr[i];

            }


        }
        System.out.println("The greatest number is : " + max);
    }
}
