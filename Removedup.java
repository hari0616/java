import java.util.*;
class Removedup{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the array size:");
int n=s.nextInt();
int arr[]=new int[n];
int temp[]=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++){
 arr[i]=s.nextInt();
}
int count=0;
for(int i=0;i<n;i++){
count=0;
for(int j=i+1;j<n;j++){
if(arr[i]==arr[j]){
count++;
}
}
if(count==0){
System.out.print(arr[i]);
}
}
}
}