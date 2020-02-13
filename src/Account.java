
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates an Account. Balance, transactions and history are ept track of.
public class Account {
    private Money balance;
    public ArrayList<Money> history = new ArrayList<Money>();
   // account constructor
    public Account(Money balance){
       this.balance = balance;
        
   }
    //makes a withdrawl to account
    public void withdraw(Money m){
    this.balance.subtract(m);
    history.add(new Money(m.getCurrency(),-m.getAmount()));
    }
    //makes a deposit to account
    public void deposit(Money m){
     this.balance.add(m);
    history.add(new Money(m.getCurrency(),m.getAmount()));
    }
    //retrieves the current balance
    public Money getBalance(){
        return this.balance;
        
    }
    //Preints out the balance
    @Override
    public String toString(){
        return "Your current balance is: "+getBalance().toString();
    }
    //prints out the "banking statement"/account history
    public void printHistory(){
        for(int j = 0; j< history.size(); j++){
            System.out.println(history.get(j));
        }
    }

}
