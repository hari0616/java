class Shapepattern{
public static void main(String args[]){
for(int i=1;i<8;i++){
for(int j=1;j<8;j++){
if(j==4)
System.out.print("1");
else if(j==3 && i!=1 && i!=7|| j==5 && i!=1 && i!=7)
System.out.print("2");
else if(i>=3 && i<=5 && j==2 ||i>=3 && i<=5 && j==6)
System.out.print("3");
else if(j==1 && i==4 ||j==7 && i==4 )
System.out.print("4");
else
System.out.print(" ");
}
System.out.println();
}
}
}
