
public class TestAccount
{
    public static void main (String[] args) {
        //creating objects
        Account acc1 = new Account (100); 
        Account acc2 = new Account (1000);
        Account acc3 = new Account ();
       
        System.out.println( (int)acc1.getBalance() + " " + (int)acc2.getBalance() + " " + (int)acc1.getBalance() );
        
        //calling instance methods
        acc1.deposit (500); //adds 500 to acc1
        acc2.deposit (acc3.getBalance()*2); //adds 2 * 0 to acc2
        acc2.deposit (acc1.getBalance()*2); //adds 2 * 600 to acc2
        acc1.transfer (acc2, 100); //transfers 100 from acc2 to acc1
        
        System.out.println( (int)acc1.getBalance() + " " + (int)acc2.getBalance() + " " + (int)acc1.getBalance() );
        
        for (int i = 0; i<10; i++) {
            int amount = (int)(Math.random()*100); //Math.random returns a double from 0-1 *100 and convert it to int
            acc1.transfer(acc2, amount);
            acc2.transfer(acc2, amount*3);
            acc3.transfer(acc1, acc1.getBalance()/2);
            
            System.out.println( (int)acc1.getBalance() + " " + (int)acc2.getBalance() + " " + (int)acc1.getBalance() );
        }
    }

}
