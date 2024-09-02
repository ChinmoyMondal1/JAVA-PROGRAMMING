import java.util.*;
public class LongestWord {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String word = sc.nextLine();

        String[] array = word.split(" ");
        int i,j;

        for(i =0;i<= array.length - 2;i++){
            System.out.println(array[i]);
            int size = array[i].length();
            int next = array[i+1].length();
            int max;
            if(next> size){
                max = next;
            }
            else{
                max = size;
            }
            System.out.println(max);
            if(array[i].length())

            }

        }
    }

