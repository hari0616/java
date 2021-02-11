import java.util.*;
class Sortarr{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,temp;
System.out.println("enter the array size:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++){
if(i==0){
System.out.print("[");
System.out.print(a[i]+",");}
else if(i==n-1){
System.out.print(a[i]);
System.out.print("]");}
else{
System.out.print(a[i]+",");
}
}
}
}



