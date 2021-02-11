import java.util.*;
class Hari{
public static void main(String args[]){
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
n=s.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print(k+"");
}

System.out.println( );
}
int count=3;
int l=n+1;
for(int i=n-1;i>0;i--){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int k=count;k<=l;k++){
System.out.print(k+"");
}
count=count+2;
l=l+1;
System.out.println( );
}
}
}
