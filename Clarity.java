class Clarity{
public static void main(String args[]){
String s="java67 class";
char a[]=s.toCharArray();
int count=0;
for(int i=0;i<a.length;i++){
if(a[i]>='0' && a[i]<='9'){
count=1;
break;
}
else{
count=0;
}
}
if(count==1){
System.out.println("yes");
}
else{
System.out.println("no");
}
}
}