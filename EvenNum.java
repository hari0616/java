import java.util.*;
class EvenNum{
public static void main(String args[]){
int arr[]=new int[40];
Scanner scan=new Scanner(System.in);
System.out.println("Enter size:");
int size=scan.nextInt();
System.out.println("enter the elements:");
for(int i=0;i<size;i++){
arr[i]=scan.nextInt();
}
for(int i=0;i<size;i++){
if(arr[i]%2==0){
System.out.println("EVEN NUMBERS:"+arr[i]);
}
}
}
}