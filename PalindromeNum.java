import java.util.*;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num");
        int n=s.nextInt();
        int r,temp,sum=0;
        
        temp=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("it is palindrome");
        
        else
            System.out.println("it is not palindrome");
        
    

}
}