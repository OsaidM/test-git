/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank;

import com.bank.account.BankAccount;

/**
 *
 * @author m5pa1k
 */

public class BankAccountApplication {
    public static void main(String [] args){
        BankAccount Osaid = new BankAccount(250, 610);
        BankAccount Wesam = new BankAccount(750, 220);
        BankAccount Ahmad = new BankAccount(550, 150);
        BankAccount Omar = new BankAccount(400, 70);
        BankAccount Omar = new BankAccount(400, 70);
        BankAccount Ola = new BankAccount(400, 70);
        
        
        Osaid.withdraw(500, 1);
        Osaid.getTotalMoney();
    }
}
