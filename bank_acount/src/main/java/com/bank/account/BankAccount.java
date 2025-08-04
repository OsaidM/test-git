/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.account;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author m5pa1k
 */
public class BankAccount {
    private String account_number;
    private double checking_balance;
    private double savings_balance;
    private static int numberOfAccounts =0;
    
    private static double totalMoney;

    public BankAccount( double checking_balance, double savings_balance) {
        this.account_number = genNumber();
        this.checking_balance = checking_balance;
        this.savings_balance = savings_balance;
        this.totalMoney += checking_balance;
        this.totalMoney += savings_balance;
        numberOfAccounts += 1;
    }

    
    
    public void accountCounter(){
        System.out.println(numberOfAccounts);
    }
    
    public void getSaving(){
        System.out.println(this.savings_balance);
    }
    
    public void getChecking(){
        System.out.println(this.checking_balance);
    }
    
    
    private String randomAccount(){
        return this.account_number;
    }
    
    private double checkingBalance(){
        return this.checking_balance;
    }
    
    private double savingBalance(){
        return this.savings_balance;
    }
    
    public String genNumber(){
        Random newRnd = new Random();
        String nums = "1234567890";
        this.account_number = "";
        while(account_number.length() < 10) {
            int x = newRnd.nextInt(nums.length());
            char singleNum = nums.charAt(x);
            account_number += singleNum;
        }
        return account_number;
    }
    
    public void depositC(double a){
        this.checking_balance += this.checking_balance;
        this.totalMoney += this.checking_balance;
    }
    
    public void depositS(double a){
        this.savings_balance += this.savings_balance;
        this.totalMoney += this.checking_balance;
    }
    
    public void withdraw(double a, int w){
        if(w == 1){
            if(this.checking_balance <= 0 || this.checking_balance < a){
                System.out.println("you don't have sufficient balance in checking balance for this withdrawl");
            }else{
                this.checking_balance -= a;//this for withdrawing from checking
                this.totalMoney -= a;
            }
        }else if(w == 2){
            if(this.savings_balance <= 0 || this.savings_balance < a){
                System.out.println("you don't have sufficient balance in savings balance for this withdrawl");
            }else{
                this.savings_balance -= a;//this for withdrawing from savings
                this.totalMoney -= a;
            }
        }else{
            System.out.println("Please choose: 1 for chicking balance or 2 for Savings");
        }
    }
    
    
    public void getTotalMoney(){
        System.out.println(this.totalMoney);
    }
    
}
