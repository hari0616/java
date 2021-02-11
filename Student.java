import java.util.*;
class Student{
int total;
float aver;
int n,sub1,sub2,sub3;
int arr[]=new int[10];
Scanner s=new Scanner(System.in);
void total(){
System.out.println("ENTER THE NO OF SUBJECT:");
n=s.nextInt();
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
for(int i=0;i<n;i++){
total=total+arr[i];
}
System.out.println("TOTAL MARK:"+total);
}
void average(){
aver=total/n;
System.out.println("AVERAGE MARK:"+aver);
}
public static void main(String args[]){
Student c=new Student();
c.total();
c.average();

}
}
