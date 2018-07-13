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
public class Car {
    String plateNumber;
    int model;
    Color carColor;
    private int doors;
    
    
    
    Car(String plateNumber, int model, Color carColor){
        this.plateNumber = plateNumber;
        this.model = model;
        this.carColor = carColor;
        System.out.println("Creating Car");
    }
    
}
