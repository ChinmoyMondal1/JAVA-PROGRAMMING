public class SkippingMultiples {
    public static  void main(String args[]){
        System.out.println("The numbers after skipping multiples of 5 from 1 to 50");
        int i;
        for(i=1;i<=50;i++){
            if(i%5==0){
                continue;
            }
            System.out.println(i + "\n");
        }
    }
}
