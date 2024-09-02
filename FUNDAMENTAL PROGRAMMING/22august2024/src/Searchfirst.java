public class Searchfirst {
    public static void main(String args[]){
        System.out.println("The first number divisible by 3 and 7 is : ");
        int i ;
        for(i=1;i<=100;i++){
            if(i%3==0 && i%7==0){
                System.out.println(i);
                break;
            }
        }
    }
}
