class Square{
public static void main(String args[]){
int n=11;
int p=(n*2)-3;
for(int i=1;i<=n;i++){
for(int j=1;j<=p;j++){
if(j==1 || j==p)
System.out.print("*");
else if(i==1 && j%2!=0 ||i==n && j%2!=0)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}

