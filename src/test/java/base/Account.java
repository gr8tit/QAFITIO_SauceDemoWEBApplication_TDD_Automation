package base;

public class Account {
    private String accountNumber;
     private double balance;

     private String accountName;


     public Account(){
         this.accountName = accountName;
         this.accountNumber = accountNumber;
         this.balance = balance;

     }

     //Actionable points
    public double getBalance(){
         return  balance;

    }

    public void deposit(double amount){
         balance += amount;


    }

    public void withdraw(double amount){
         if(amount < balance){
             System.out.println(amount);

         }else{
             System.out.println("Insufficient fund");
         }


    }

    public static void main(String[] args){
         Account acct = new Account();
         acct.getBalance();
         acct.deposit(5000000.00);
         acct.withdraw(250000);

    }


}
