class ExceptAeiou1{
public static void main(String args[]){
String s[]={"helo","aeo","bwm"};
int count=0,count1=0;
for(int i=0;i<s.length;i++){
String a=s[i];
count=0;
count1=0;
char arr[]=a.toCharArray();
for(int j=0;j<arr.length;j++){
if(arr[j]=='a'||arr[j]=='e'|| arr[j]=='i'|| arr[j]=='o'|| arr[j]=='u'|| arr[j]=='A'|| arr[j]=='E'|| arr[j]=='I'|| arr[j]=='O'|| arr[j]=='U'){
count=0;
//System.out.println(arr[j]);
}
else{
count1=count1+1;
}
}
if(count1==s[i].length()){
System.out.println(s[i]);
}

}
}
}