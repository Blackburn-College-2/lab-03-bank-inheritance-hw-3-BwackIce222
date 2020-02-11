
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

public class Account {
    private Money balance;
    public ArrayList<Money> history = new ArrayList<Money>();
    
    public Account(Money balance){
       this.balance = balance;
        
   }
    public Money withdraw(Money m){
        this.balance.subtract(m);
        this.balance.add(m);
        
        return this.balance;
    }
    public Money deposit(Money m){
        history.add(0, m);
        return this.balance;
    }
    public Money getBalance(){
        return this.balance;
        
    }
    @Override
    public String toString(){
        return "Your current balance is: "+getBalance();
    }

}
