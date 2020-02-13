/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates a Money object and stores the curency and ammount
public class Money {

    private Currency currency;
    private long amount;
//Money constructor
    public Money(Currency currency, long amount) {
        this.currency = currency;
        this.amount = amount;

    }
//Prints out the current balance in the account
    public String getAmountString() {
        return "Current balance is: " + this.amount;
    }
//adds money to the account
    public Money add(Money input) {
        this.amount += input.getAmount();
        System.out.println("A total of: " + input.getAmount() + input.getCurrency().toString() + " has been deposited.");
        return this;
    }
//removes money from the account
    public Money subtract(Money input) {
        this.amount += input.getAmount();
        System.out.println("A total of: " + input.getAmount() + input.getCurrency().toString() + " has been withdrawn.");
        return this;
    }
//prints out the aamount and currency
    @Override
    public String toString() {
        return ""+this.getAmount() + this.currency.toString();
    }
//gets the amount of money
    public long getAmount() {
        return this.amount;
    }
//gets the currency of money
    public Currency getCurrency() {
        return this.currency;
    }
    public void multiply(long x){
       long product = this.amount*x;
    }
    
}

