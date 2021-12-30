import java.util.Date;
public class AccountNeso{
    public static void main(String[] args){

        Account account = new Account(1122,20000,4.5);
        System.out.println("\n");
        if (account.withdraw(2500))
        System.out.println("True");
        else System.out.println("False");
        account.deposit(3000);

        System.out.println("\n");
        System.out.println(account.getId());
        System.out.println(account.getBalance());
        System.out.println(account.getAnnualInterestRate());
        System.out.println(account.getDateCreated());
    }

        }
 class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

        this.dateCreated = new Date();
        System.out.print(dateCreated);
    }

    public boolean withdraw(double amount){
       if(this.balance-amount >=0 ? true : false){
           this.balance -= amount;
           return true;
       }
       return false;

    }

    public void deposit(double money){
        this.balance += money;
    }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     public double getAnnualInterestRate() {
         return annualInterestRate;
     }

     public void setAnnualInterestRate(double annualInterestRate) {
         this.annualInterestRate = annualInterestRate;
     }

     public Date getDateCreated() {
         return dateCreated;
     }

     public void setDateCreated(Date dateCreated) {
         this.dateCreated = dateCreated;
     }
 }
