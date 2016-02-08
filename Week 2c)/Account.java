
public class Account
{
    private double balance; //state
    
    public Account (double amount) {
        balance = amount;
    }
    
    public Account () {
        balance = 0;
    }
    
//     public static double square(double d) {
//         double squareRoot = d / 2;
//         double t = squareRoot + 1;
//         while ((t - squareRoot) != 0) {
//             t = squareRoot;
//             squareRoot = (t + (d/t)) / 2;
//         } 
//         return squareRoot;
//     }
        
    public void deposit (double amount) {
        balance += amount;
    }
    
    public void withdraw (double amount) {
//        amount = square(amount); //squares
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
