import java.util.Scanner;

public class AreaCalculate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shape to find its area... \n 1.Circle \n 2.Rectangle \n 3.Triangle");
        int choice = sc.nextInt();
        double area;
        switch (choice){
            case 1:
                System.out.println("Enter the radius");
                double r = sc.nextDouble();
                 area = CalculateArea(r);
                System.out.println("The Area of the circle is : " + area );
                break;
            case 2:
                System.out.println("Enter the length and breadth of the rectangle");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                area = CalculateArea(length,breadth);
                System.out.println("The area of the rectangle is : "+ area);
                break;
            case 3:
                System.out.println("Enter the base and height of the triangle");
                double base =sc.nextDouble();
                double height =sc.nextDouble();
                 area =CalculateArea(base,height,0.5);
                System.out.println("The area of the triangle is : "+ area);

            default:
                System.out.println("Invalid choice");
        }
    }
    public static double CalculateArea(double radius){
                return Math.PI * Math.pow(radius,2);
    }
    public static double CalculateArea(double l, double b){
        return l*b;
    }
    public static double CalculateArea(double b,double h,double pi){
        return (pi*(b * h));
    }
}
