class Star{
public static void main(String args[]){
int t=7;

for(int i=1;i<=t;i++){
for(int j=1;j<=t;j++){
//if(j==t && i==1 || i==t && j==1)
//System.out.print("*");
if(i==j || j==(t-i+1)){
System.out.print("*");
}
//else if(i%2==0 && j%2==0)
//System.out.print("*");
else{
System.out.print(" ");
}
}
System.out.println( );
}
}
}