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
public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String email;
    
   //1st constructor - Empty 
   public VIPCustomer(){
      this("Trump", 99.0, "donald.trump@USA.com");
   } 
   
   public VIPCustomer(String name, double creditLimit){
      this(name,creditLimit,"default@USA.com");
   }
   
   public VIPCustomer(String name, double creditLimit, String email){
      this.name = name;
      this.creditLimit = creditLimit;
      this.email = email;
   } 
}
