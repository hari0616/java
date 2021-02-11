import java.util.*;

public class ProductSample{
    String name="Milky Bar;
    String stock="BOM789";
    String Brand="Nestle";
    int price=1000;
    int discount=20;
    
    int total=price-discount;
    public static void main(String[] args) {
        
        Product pro=new Product();
        System.out.println(pro.name);
        System.out.println(pro.stock);
        System.out.println(pro.Brand);
        System.out.println(pro.total);
        
    }
    
}
