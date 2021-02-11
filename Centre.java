class Centre{
/*public static void main(String args[]){
int arr[]={1,2,1,3,5,3,6,7,6};
int n=arr.length;
int k=3;
int t=0,p=3;
for(int i=0;i<n-k+1;i++){
for(int j=i;j<p;j++){
t=(p-1)/2;
System.out.print(t);
if (arr[t-1]==arr[t-2]){
System.out.print(arr[t]);
}
}
p=p+1;
}
}*/
public static void main(String args[]){
int arr[]={1,2,1,3,5,3,6,7,6};
int n=arr.length;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]==arr[j] && i==j-2){
System.out.print(arr[i+1]+" ");
}
}
}
}
}
