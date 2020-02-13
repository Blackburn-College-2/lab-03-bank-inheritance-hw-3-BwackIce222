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
        Currency currency = new Currency("USD", "$");
        Money money = new Money(currency, 0);
        Money money1 = new Money(currency, 0);
        Money money01 = new Money(currency,1000);
        CheckingAccount account = new CheckingAccount(money);
        Money money2 = new Money(currency, -2);
        Money money3 = new Money(currency, 3);
        Money money4 = new Money(currency, -4);
        Money money5 = new Money(currency, 5);

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
        account.printHistory();
        System.out.println("");
        System.out.println(money.getAmountString());

        SavingsAccount saccount = new SavingsAccount(money1);
        saccount.withdraw(money2);
        saccount.withdraw(money3);
        saccount.withdraw(money2);
        saccount.deposit(money4);
        saccount.deposit(money5);
        saccount.deposit(money2);
        saccount.printHistory();
        System.out.println(account.getBalance());
        
        System.out.println(saccount.getBalance());
        Loan loan = new Loan(money01);
        System.out.println(loan.toString());
        
        loan.amortization(account, money4);
       //Time Estimation 7hours. Actual time 10hours
    }
}
