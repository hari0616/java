class AscendDescend{
public static void main(String args[]){
int a[]={5,7,3,9,6,2};
int temp;
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("ASCENDING ORDER=");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println(" ");
System.out.print("DESCENDING ORDER=");
for(int i=a.length-1;i>0;i--){
System.out.print(a[i]+" ");
}
}
}