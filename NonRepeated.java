class NonRepeated{
public static void main(String args[]){
String s="helloworld";
char a[]=s.toCharArray();
int count;
for(int i=0;i<a.length;i++){
count=1;
for(int j=i+1;j<a.length;j++){
//System.out.print(a[i]);
if(a[i]==a[j] && a[i]!=' '){
count=count+1;
a[j]='0';
}
}
if(count==1 && a[i]!='0'){
System.out.print(a[i]);
break;
}
}
}
}