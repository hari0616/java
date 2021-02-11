import java.util.*;
class Circle{
int radius;
double ar,peri;
Scanner s=new Scanner(System.in);
void input(){
System.out.println("ENTER THE VALUES OF RADIUS:");
radius=s.nextInt();
}
void area(){
double ar = Math.PI * radius * radius;
System.out.println("AREA OF THE CIRCLE:"+ar);
}
void perimeter(){
double peri;
peri=2 * Math.PI * radius;
System.out.println("PERIMETER OF CIRCLE:"+peri);
}
public static void main(String args[]){
Circle c=new Circle();
c.input();
c.area();
c.perimeter();
}
}
