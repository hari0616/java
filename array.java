class Array{
public static void main(String args[]){
int a[]=new int[]{4,5,3,2};
int sum=0,average=0;
for(int i=0;i<a.length;i++){
sum=sum+a[i];
}
average=sum/5;
System.out.print("Sum="+sum);
System.out.print("Average="+average);
}
}