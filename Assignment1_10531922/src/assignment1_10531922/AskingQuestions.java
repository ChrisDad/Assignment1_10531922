/*
 * This is a set of codes that are in the .
 * The first assignment given
 * 28/02/2016.
 */
package assignment1_10524836;

/**
 *
 * @author Fred Adu Twums
 * 
 */

import java.util.Scanner;

public class AskingQuestions{

    /**
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        String height,inches;
        double weight;
        
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print("How tall are you? ");
        height = keyboard.next();
        
        System.out.println("How many inches? ");
        inches = keyboard.next();
        
        System.out.println("How much do you weigh? ");
        weight = keyboard.nextDouble();
        
        System.out.println("So you're " + age + " old, " + height + inches + " tall and " + weight + " heavy");  
    }
    
    
}
