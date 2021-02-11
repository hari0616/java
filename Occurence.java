class Occurence{
public static void main(String args[]){
String s="Hello connrent";
char a[]=s.toCharArray();
int count=0;
for(int i=0;i<a.length;i++){
 count=0;
for(int j=i+1;j<a.length;j++){
if(a[i]==a[j])
count=count+1;
//System.out.println(count);
}
if(count==1){
System.out.print(a[i]);
}
}
}
}


