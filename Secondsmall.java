import java.util.*;
class Secondsmall{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the array size:");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++){
 arr[i]=s.nextInt();
}
int max=arr[0];
int secmax=arr[0];
for(int i=0;i<n;i++){
if(arr[i]>max){
secmax=max;
max=arr[i];
}
else if(arr[i]>secmax){
secmax=arr[i];
}
}
System.out.println("SECOND MAXIMUN:"+secmax);
int min=arr[0];
int smin=arr[0];
for(int i=0;i<n;i++){
if(arr[i]<min){
smin=min;
min=arr[i];
}
else if(arr[i]<smin && arr[i]!=min){
smin=arr[i];
}
}
System.out.println("SECOND MININUM:"+smin);
}
}