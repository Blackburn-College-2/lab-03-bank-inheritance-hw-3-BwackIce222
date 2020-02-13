/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Creates a savings account
public class SavingsAccount extends Account {
    private final double interestRate = 1.0445;
    public SavingsAccount(Money balance) {
        super(balance);
    }
   public double acrue(Money money){
       double accrual = money.getAmount()*this.interestRate;
       return accrual;
   } 
    @Override
   public void withdraw(Money m){
        this.balance.subtract(m);
    history.add(new Money(m.getCurrency(),-m.getAmount()));
       this.acrue(balance);
   }
}
