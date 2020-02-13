/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates a currency object, the name of the currency and symbol are kept
public final class Currency {
    private String name;
    private String symbol;
    //Constructor for currency
    public Currency(String name, String symbol){
    this.name = name;
    this.symbol = symbol;    
    }
    //didn't recieve direction to use this yet
    public boolean equals(Object object){
        return true;
        
    }
    //Prints out the symbol and name of the currency being used
    @Override
    public String toString(){
        return ""+this.symbol+" "+this.name;
    }

}
