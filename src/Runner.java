/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author montreal.thomas
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Currency currency = new Currency("USD","$");
        Money money = new Money(currency,0);
        Account account = new Account(money);
        Money money2 = new Money(currency,-2);
        Money money3 = new Money(currency,3);
        Money money4 = new Money(currency,-4);
        Money money5 = new Money(currency,5);
  
        account.deposit(money2);
        account.deposit(money3);
        account.deposit(money4);
        account.deposit(money4);
        account.deposit(money5);
        account.withdraw(money4);
        account.withdraw(money2);
        account.withdraw(money2);
        account.withdraw(money2);
        account.withdraw(money2);
        
        System.out.println(money.toString());
        System.out.println("");
        account.printHistory(account);
        System.out.println("");
        System.out.println( money.getAmountString());
        

        
      
       System.out.println(account.getBalance());
      
    
}
}
