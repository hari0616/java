import java.util.*;
class Vowels{
public static void main(String args[]){
String s="haridha";
//String v="aeiou";
char a[]=s.toCharArray();
//char b[]=v.toCharArray();
int count=0,count1=0;
for(int i=0;i<a.length;i++){
if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='u'){
count++;
}
else if(a[i]>='b' && a[i]<='z'){
count1++;
}
else{
System.out.print("special character");
}
}
System.out.println("vowels="+count);
System.out.println("Consonants="+count1);
}
}
