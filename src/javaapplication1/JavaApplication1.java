/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.util.Scanner;

// Reading data from a file using FileReader
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * @author romal
 */
public class JavaApplication1 {

    public static int myFactorial(int number){
        int finalAnswer = 1 ;
        int i = 1;
        
        if (number == 0)
            return 1;        
        
        while (i <= number)
        {
            finalAnswer *= i; 
            i++;
        }
        System.out.println("Factorial of " + number + " is " + finalAnswer);
        return finalAnswer;
    }
    
    public static int myFibonacci(int number){
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
        int sum = 0, num1 = 0, num2 = 1;
        int i = 0;
        
        System.out.print("Fibonacci series of "+ number + ": " + num1 + " " + num2);
        
        while (i <= number){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
            System.out.print(" " + sum);
        }
        System.out.println("...Sequence over....");
        return 1;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
        //String userInput = sc.next();
//        
//        
//        int[] myArray = {1,2,3,4,5};
//        int[] myArray2 = new int[5];
//        
//        System.out.println("Hello World");
//        Car MyCar = new Car("AOA3062",2014,Color.RED);
//        MyCar.carColor = Color.BLACK;
//        System.out.println(MyCar.carColor);
//        
//        //Factorial
//        myFactorial(5);
//        myFactorial(6);
//        
//        //Fibonacci
//        myFibonacci(5);
//        myFibonacci(10);
        
        //        Car MyCar = new Car("AOA3062",2014,Color.RED);
        //BankAccount MyBankAccount = new BankAccount(123456, 10000.0, "BPI", roelprimero@gmail.com);
        
        
//        //CONSTRUCTOR LESSON
//        BankAccount MyBankAccount = new BankAccount(123456, 0, "BPI", "roelprimero@gmail.com");
//        MyBankAccount.withdraw(100000);
//        MyBankAccount.deposit(100);
//        MyBankAccount.withdraw(90);
//        
        
//        //INHERITANCE LESSON
//        Dog mochi = new Dog("Hairy", 20, "Mochi", 1,1,1);
//        mochi.eat();
//        mochi.walk(20);
        
        int iLineCounter = 0;
        int i = 0;
        
        
         //Student[] studentArray = new Student[7];
        SupportRep[] repArray = new SupportRep[12];
        
        
        //File Reader Module
        try {
                File file = new File("Input1.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                        //stringBuffer.append(line);
                        //stringBuffer.append("\n");
                        
                        //System.out.println(line + "\n" + iLineCounter);
                        //line contains String repName, int priority, int dailyCallToday, int shiftTier
                        //               0              1             2                 3             
                        //parse line
                        String[] splitStr = line.split("\\s+");
                        //System.out.println(iLineCounter + splitStr[0] + splitStr[1] + splitStr[2] + splitStr[3]);
                        repArray[iLineCounter] = new SupportRep(splitStr[0], Integer.parseInt(splitStr[1]),Integer.parseInt(splitStr[2]), splitStr[3]);
                        iLineCounter++;
                        
                }
                fileReader.close();
                //System.out.println("Contents of file:");
                //System.out.println(stringBuffer.toString());
        } catch (IOException e) {
                e.printStackTrace();
        }        
        //rotation Printer
        
        /*
        Order of Sort
        1. Sort per callTier [4]
        2. Sort per Calls per day [3] 
        */
        
        //first sort
        System.out.println(Arrays.asList(repArray));
        Arrays.sort(repArray);
        System.out.println(Arrays.asList(repArray));
        
         // 2. sort using comparator: sort by id
        Arrays.sort(repArray, new Comparator<SupportRep>() {
            @Override
            public int compare(SupportRep o1, SupportRep o2) {
                return o1.shiftTier.compareTo(o2.shiftTier);
            }
        });
        System.out.println(Arrays.asList(repArray));
        //sort Day case, use repArray[i] 
            // if 9 pm
        
            // if 12 am
        
            // if 3 am
        
            // if 6 am
        
        //System.out.println(repArray[1].getRepName());
        //System.out.println(repArray[2].getRepName());
        
        //printer
        i = 0;
        while (i < iLineCounter ){
            System.out.println(repArray[i].getRepName() + " " + repArray[i].getShiftTier());
            i++;
        }        
        
        
    }
}
