class DiamondNumber{
public static void main(String args[]){
int n=7;//height
int space=n/2;//space
int st=1;//st for number pattern
for(int i=1;i<=n;i++){//outer loop
for(int j=1;j<=space;j++){//inner loop for space
System.out.print(" ");
}
int count=st/2+1;//print the number
for(int k=1;k<=st;k++){
System.out.print(count);
if(k<=(st/2)){
count--;
}
else{
count++;
}
}
System.out.println();
if(i<=n/2){
space=space-1;
st=st+2;
}
else{
space=space+1;
st=st-2;

}
}
}
}
