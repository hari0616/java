import java.util.*;
class Stringp{
public static void main(String args[]){
//String s="hari hellohh";
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
//int n=s.nextInt();
String a=s.nextLine();
char arr[]=a.toCharArray();
a="";
if(arr[0]==arr[arr.length-1] && arr[0]==arr[arr.length-2]){
for(int j=1;j<arr.length-2;j++){
a=a+arr[j];
}
System.out.println(a);
}
else{
System.out.println("wrong string");
}

}
}
