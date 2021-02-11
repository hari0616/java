import java.util.*;

public class Swap2 {
    int a,b,c;
    Scanner s=new Scanner(System.in);
    void swaps(){
        System.out.println("Enter the value a");
        a=s.nextInt();
        System.out.println("Enter the value b");
        b=s.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("After swap"+" "+b+" "+a);
    }
    
    public static void main(String[] args) {
        Swap3 sw=new Swap3();
        sw.swaps();
        
    }
    
}