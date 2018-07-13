/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author romal
 */
public class Animal {
    private String name;
    private int brain;
    int body;
    int size;

    public Animal(String name, int brain, int body, int size) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
    }
    
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    
    public void move (int speed){
        System.out.println("Animal.move() called " + speed);
    }
    
    public void walk (int speed){
        System.out.println("Animal.walk() called " + speed);
    }

}
