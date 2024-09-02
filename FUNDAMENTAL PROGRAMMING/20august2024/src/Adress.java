import java.util.Scanner;

public class Adress {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your street name");
        String street = sc.nextLine();
        System.out.println("Enter your city name");
        String city = sc.nextLine();
        System.out.println("Enter your city name");
        int zip = sc.nextInt();

        System.out.println("Your Address is : \n" + street + ",\n" + city + ",\n" + zip );

    }
}
