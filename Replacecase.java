class Replacecase{
public static void main(String args[]){
String s="jAvA PrOgRaM";
char c;
String a="";
for(int i=0;i<s.length();i++){
c=s.charAt(i);
if(c>=65 && c<=90){
a=a+(char)(c+32);
}
else if(c>=97 && c<=122){
a=a+(char)(c-32);
}
else{
a=a+c;
}
}
System.out.println(a);
}
}
