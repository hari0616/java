public class ContainsExample {
   public static void main(String args[]){
      String sample = "krishna56 java";
      int count=0;
      char[] c = sample.toCharArray();
      for(int i=0;i<c.length;i++){
         if(c[i]>='0' && c[i]<='9'){
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