/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10524836;

import java.util.Scanner;

/**
 *
 * @author Fred Adu Twum
 */
public class NameAgeSalary {
        public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            String name;
            int age;
            float pay;
            
            System.out.println("Hello, What is your name? ");
            name = keyboard.next();
            
            System.out.println("\nhi " + name + "! How old are you? ");
            age = keyboard.nextInt();
            
            System.out.println("\nSo you are "+ age + ", eh? That's not old at all!");
            System.out.println("How much do you make, "+ name +"?");
            pay = keyboard.nextFloat();
            
            System.out.println("\n"+ pay + "! I hope that's per hour not per year! LOL! ");
        
            
            
        }
}
