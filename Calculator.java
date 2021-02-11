import java.util.*;
class Calculator{
int a,b;
Scanner s=new Scanner(System.in);
void add(){
System.out.println("ENTER THE VALUES OF INPUT1:");
a=s.nextInt();
System.out.println("ENTER THE VALUES OF INPUT2:");
b=s.nextInt();
int sum;
sum=a+b;
System.out.println("ADD="+sum);
}
void diff(){
System.out.println("ENTER THE VALUES OF INPUT1:");
a=s.nextInt();
System.out.println("ENTER THE VALUES OF INPUT2:");
b=s.nextInt();
int sub;
sub=a-b;
System.out.println("DIFF="+sub);
}
void prod(){
System.out.println("ENTER THE VALUES OF INPUT1:");
a=s.nextInt();
System.out.println("ENTER THE VALUES OF INPUT2:");
b=s.nextInt();
int mul;
mul=a*b;
System.out.println("PRODUCT="+mul);
}
void div(){
System.out.println("ENTER THE VALUES OF INPUT1:");
a=s.nextInt();
System.out.println("ENTER THE VALUES OF INPUT2:");
b=s.nextInt();
int division;
 division=a/b;
System.out.println("DIVISION="+ division);
}
public static void main(String args[]){
Calculator cal=new Calculator();
cal.add();
cal.diff();
cal.prod();
cal.div();
}
}