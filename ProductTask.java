import java.util.*;

public class ProductTask {
    String pname,pbrand,pstock;
    String cname,caddress,email;
    long mob;
    Scanner s=new Scanner(System.in);
    void proinfo(){
        System.out.println("Enter the product name");
        pname=s.next();
        System.out.println("Enter the brand");
        pbrand=s.next();
        System.out.println("Enter the stock");
        pstock=s.next();
    }
    void clientinfo(){
        System.out.println("Enter the client name");
        cname=s.next();
        System.out.println("Enter the address");
        caddress=s.next();
        System.out.println("Enter the email");
        email=s.next();
        System.out.println("Enter the mobile number");
        mob=s.nextLong();
        
    }
    void placeorder(){
        System.out.println("pro name="+" "+pname);
        System.out.println("pro brand="+" "+pbrand);
        System.out.println("pro stock="+" "+pstock);
        System.out.println("client name="+" "+cname);
        System.out.println("client address="+" "+caddress);
        System.out.println("client mobile="+" "+mob);
        System.out.println("client email="+" "+email);
    }
    
    
    public static void main(String[] args) {
        Product1 pro=new Product1();
        pro.proinfo();
        pro.clientinfo();
        pro.placeorder();
    }
    
}