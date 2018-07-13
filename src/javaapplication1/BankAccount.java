/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.*;

/**
 *
 * @author romal
 */
public class BankAccount {
    int number;
    double balance;
    String name;
    String email;
    
    public BankAccount () {
        
        //Empty Constructor
        this(2, 999, "BDO", "johnpatino@gmail.com"); //calling other constructor
    }
    
    
    //overloading
    public BankAccount (int number, double balance, String name, String email){
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        System.out.println("Creating Bank Account");
    }
    
    //another constructor this time first 2 params are specified
    public BankAccount (String name, String email){
        this(3, 200, name, email);
        System.out.println("Creating Bank Account");
    }
    
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited " + amount);
    }
    
    public void withdraw (double amount){
        if (amount > this.balance)
        {
            System.out.println("Cant Withraw " + amount + " Balance left is " + this.balance);
        }else{ 
            this.balance -= amount;
            System.out.println("Remaning Balance is  " + this.balance);
        }
    }
}
