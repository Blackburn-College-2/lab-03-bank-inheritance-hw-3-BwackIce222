/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Money {
    private Currency currency;
    private long amount;
    
    public Money(Currency currency,long amount){
        this.currency = currency;
        this.amount = amount;
        
    }
    public String getAmountString(){
     return "hi";   
    }
    public Money add(Money input){
     return input;
    }
    public Money subtract(Money input){
        return input;
    }
   // @Override
   // public String toString(){
        
   // }
}
