/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montr
 */
//Takes out a loan and pays off the loan
public class Loan extends Account {
    private final long interestRate = 2;
    private long loanBalance;
    public Loan(Money balance) {
        super(balance);
        this.loanBalance = balance.getAmount();
    }
public long loanAccruity(Money money){
    long loanAmnt = money.getAmount()*this.interestRate;
    return loanAmnt;
 
}
public void amortization(CheckingAccount acc, Money m){
  acc.withdraw(m);
  this.loanBalance -= m.getAmount();
    
}
    @Override
    public String toString(){
    return "You took out a loan of: "+ loanBalance;
}
}
