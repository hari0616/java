class ExceptAeiou{
public static void main(String args[]){
String s[]={"helo","hai","bwm"};
int count=0;
for(int i=0;i<s.length;i++){
String a=s[i];
count=0;
char arr[]=a.toCharArray();
for(int j=0;j<arr.length;j++){
if(arr[j]!='a' || arr[j]!='e'|| arr[j]!='i'|| arr[j]!='0'|| arr[j]!='u'|| arr[j]!='A'|| arr[j]!='E'|| arr[j]!='I'|| arr[j]!='O'|| arr[j]!='U'){
count=count+1;
System.out.println(arr[j]);
}
}
if(count==s[i].length()){
System.out.println(s[i]);
}
}
}
}