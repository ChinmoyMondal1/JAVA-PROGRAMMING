import java.util.Scanner;
import java.math.*;

public class reversearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i;
        int j;


        System.out.println("Enter the values");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        //Checking the cases : even size or odd size

        if(size%2==0) {
            int mid1 = size/2;
            int mid = (int)mid1;
            int startarr[] = new int[size/2];
            int endarr[] = new int[size/2];
         for(i=0;i<mid;i++){
             startarr[i] = arr[i];
        }
         for(i=mid;i<arr.length-1;i++){
             for(j=0;j<size/2;j++){
                 endarr[j] = arr[i];
             }
         }
         for(i=0;i<size/2;i++){
             System.out.println(startarr[i]);
             System.out.println(endarr[i]);
         }




        }
    }
}