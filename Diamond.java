class Diamond{
public static void main(String args[]){
//int space=1;
int n=5;//height
int space=n-1;//space 
for(int i=1;i<=n;i++){
for(int j=1;j<=space;j++){
System.out.print(" ");
}space--;
for(int j=1;j<=(2*i)-1;j++){
System.out.print("*");
}
System.out.println();
}
space=1;
for(int i=1;i<=n-1;i++){
for(int j=1;j<=space;j++){
System.out.print(" ");
}
space++;
for(int j=1;j<=2*(n-i)-1;j++){
System.out.print("*");
}
System.out.println();
}

}
}

