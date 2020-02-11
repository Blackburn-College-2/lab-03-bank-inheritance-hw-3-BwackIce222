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
    private double balance;
    
    public Account(double balance){
       this.balance = balance;
        
   }
    public double withdraw(double m){
        this.balance -= m;
        return this.balance;
    }
    public double deposit(double m){
        this.balance += m;
        return this.balance;
    }
    public double getBalance(){
        return this.balance;
        
    }

}
