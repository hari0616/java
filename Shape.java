class Shape{
public static void main(String args[]){
int n=9;
int p=n/2+1;
for(int i=n;i>=0;i=i-2){
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int k=n;k>=i;k--){
System.out.print("* ");
}
System.out.println();
}
}
}

  