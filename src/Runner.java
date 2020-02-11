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
        Account account = new Account(0.00);
        account.withdraw(2.53);
        account.deposit(4.00);
        System.out.printf("%.2f \n",account.getBalance());
      
    
}
}
