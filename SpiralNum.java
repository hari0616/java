import java.util.*;
class SpiralNum{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter size:");
int size=scan.nextInt();
int row=0,col=0;
int boun=-1,sizel=-1;
int flag=1;
char move='r';
int mat[size][size]={0};
for(int i=1;i<=(size*size)+1;i++){
mat[row][col]=i;
switch(move){
case 'r':
col+=1;
break;
case 'l':
col-=1;
break;
case 'u':
row-=1;
break;
case 'd':
row+=1;
break;}
}
if(i==boun){
boun+=sizel;
if(flag!=2){
flag=2;}
else{
flag=1;
sizel=-1;}
switch(move){
case 'r':
move=d;
break;
case 'l':
move=u;
break;
case 'u':
move=r;
break;
case 'd':
move=l;
break;}}
}
for(row=0;row<size;row++){
for(col=0;col<size;col++){
int n=matrix[row][col];

\

