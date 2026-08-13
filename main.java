import java.util.Scanner;
class BankAccount{
    private int accountno;
    private String holdername;
    private int balance;
    int amount;
    public BankAccount(int accountno,String holdername,int balance){
this.accountno=accountno;
this.holdername=holdername;
this.balance=balance;
    }
    public BankAccount(){
        accountno=124;
        holdername="harry";
        balance=7000;
 }
    public BankAccount(BankAccount account2){
this.accountno=account2.accountno;
this.holdername=account2.holdername;
this.balance=account2.balance;
    }
    public void deposit(int amount){
this.balance+=amount;
System.out.println("your current balance after deposit is"+" "+balance);
    }
    public void withdraw(int amount){
 this.balance-=amount;
System.out.println("your current balance after withdrawal is"+" "+balance);
 }
    public int getaccountno(){
        return accountno;
        }
    public String getholdername(){
        return holdername;
    }
     public int getbalance(){
        return balance;
    }
    public BankAccount getreceiptcopy(){
        System.out.println("----PRINTING TRANSACTION RECEIPT COPY----");
        return new BankAccount(this);
        }
}
class Main {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        BankAccount account2=new BankAccount(156,"meerab",10000);
        BankAccount account3=new BankAccount(account2);
        System.out.println("----------------------");
        System.out.println("details of account1:");
        System.out.println(account1.getaccountno());
         System.out.println(account1.getholdername());
          System.out.println(account1.getbalance());
        account1.deposit(1000);
 BankAccount receipt1=account1.getreceiptcopy();
       System.out.println(receipt1.getaccountno());
        System.out.println(receipt1.getholdername());
         System.out.println(receipt1.getbalance());
        System.out.println("----------------------");
        System.out.println("details of account2:");
         System.out.println(account2.getaccountno());
         System.out.println(account2.getholdername());
          System.out.println(account2.getbalance());
        account2.withdraw(1000);
         BankAccount receipt2=account2.getreceiptcopy();
       System.out.println(receipt2.getaccountno());
        System.out.println(receipt2.getholdername());
System.out.println(receipt2.getbalance());
        System.out.println("----------------------");
         System.out.println("details of account3:");
          System.out.println(account3.getaccountno());
         System.out.println(account3.getholdername());
          System.out.println(account3.getbalance());
        account3.deposit(1000);
         BankAccount receipt3=account3.getreceiptcopy();
       System.out.println(receipt3.getaccountno());
        System.out.println(receipt3.getholdername());
         System.out.println(receipt3.getbalance());
}
}