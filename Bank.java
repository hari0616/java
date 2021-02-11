import java.util.*;

class Bank {
    int balance=10000;
    double acc;
    String Name;
    String Branch;
    int dep;
    int with;
    int total;
    Scanner s=new Scanner(System.in);
    void deposit(){
        System.out.println("Enter the use name");
        Name=s.next();
        System.out.println("Enter branch name ");
        Branch=s.next();
        System.out.println("Enter account number");
        acc=s.nextDouble();
        System.out.println("enter the deposit amount");
        dep=s.nextInt();
        total=balance+dep;
        System.out.println("balance="+total);
        
    }
    void withdraw(){
        System.out.println("Enter the use name");
        Name=s.next();
        System.out.println("Enter branch name ");
        Branch=s.next();
        System.out.println("Enter account number");
        acc=s.nextDouble();
        System.out.println("Enter the withdraw amount");
        with=s.nextInt();
        total=balance-with;
        System.out.println("balance="+total);
        
    }
    
    public static void main(String[] args) {
        Bank b=new Bank();
        b.deposit();
        b.withdraw();
        
       
    }
    
}