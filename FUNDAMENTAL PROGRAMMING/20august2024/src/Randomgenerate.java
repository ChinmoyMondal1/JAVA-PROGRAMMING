import java.util.Random;
public class Randomgenerate {
    public static void main(String args[]){
        Random ran = new Random();
        int upperlimit = 100;
        int lowerlimit = 1;
        int random_int = ran.nextInt(lowerlimit,upperlimit);
        System.out.println(random_int);
    }
}
