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
public class Dog extends Animal{
    private String hair;
    private int tooth;

    public Dog(String hair, int tooth, String name, int brain, int body, int size) {
        super(name, brain, body, size);
        this.hair = hair;
        this.tooth = tooth;
    }
    
    public void moveLegs(){
        System.out.println("Dog.moveLegs() called ");
    }
    
    
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        super.eat();
    }
    
    @Override
    public void walk(int speed){
        System.out.println("Dog.walk() called");
        moveLegs();
        move(speed);
    }
    
    
}
