import java.util.*;
public class Amstrongnum {
    
    public static void main(String[] args) {
        int t,r,a=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();
        t=n;
        while(n>0){
            r=n%10;
            n=n/10;
            a=a+(r*r*r);
           
            }
        if(t==a){
            System.out.println(t+" "+"Amstrong number");
        }
        else{
            System.out.println(t+" "+"not Amstrong number");
        }
    }
    
}