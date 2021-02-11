import java.util.*;
public class EvenOddnum {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        int a=n/2;
        if((a*2)==n){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
       
    }
    
}