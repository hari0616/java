class Punctuation{
public static void main(String args[]){
String s="jfk*!;''";
char a[]=s.toCharArray();
int count=0;
for(int i=0;i<a.length;i++){
if(a[i]=='!' || a[i]=='.'|| a[i]==',' || a[i]=='-'|| a[i]=='?' || a[i]=='\''|| a[i]==';'||a[i]==':'|| a[i]=='\"'){
count=count+1;
}
} 
System.out.println("total count of punctuation="+count);
}
}
