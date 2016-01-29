
public class Account
{
    private double balance; //state
    
    public Account (double amount) {
        balance = amount;
    }
    
    public Account () {
        balance = 0;
    }
    
    public void deposit (double amount) {
        balance += amount;
    }
    
    public void withdraw (double amount) {
       if (balance >= amount){
           balance -= amount;
        }
        else {
            System.out.println("not enough funds");
        }
    }
    
    public void transfer (Account acc, double amount) {
        if (acc.getBalance()>=amount) {
               balance += amount;
               acc.withdraw (amount);
            }
            else {
                System.out.println("not enough funds");
            }
        }
        
    public double getBalance() {
        return balance;
    }
    
    public void close () {
        balance = 0;
    }
    
}
