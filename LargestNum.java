class LargestNum{
public static void main(String args[]){
int arr[]=new int[]{7,9,4,2,1};
int larg=arr[0];
for(int i=1;i<arr.length;i++){
if(larg<arr[i]){
larg=arr[i];
}
}
System.out.println(larg);
}
}