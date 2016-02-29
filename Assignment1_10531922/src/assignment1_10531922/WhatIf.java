/*
 * this work is a licensed property of 10524836.
 *  all rights reserved copyright ©skryptchez kodez
 *  28/02/2016.
 */
package assignment1_10524836;

/**
 *
 * @author CHRISTIAN
 */
public class WhatIf {
    public static void main(String[]args){
        int people = 20;
        int cats = 20;
        int dogs = 15;
        
        if ( people < cats)
        {
            System.out.println("Too many cats! The world is doomed!");
        }
        if (people > cats)
        {
            System.out.println("Not many cats!, the world is saved!");
        }
        if (people > dogs)
        {
            System.out.println("The world is dry!");
        }
        dogs += 5;
        if (people >= dogs)
        { 
            System.out.println("People are greater than or equal to dogs.");
        }
        if (people <= dogs)
        {
            System.out.println("People are less than or equal to dogs.");
        if (people == dogs)
        {
            System.out.println("People are dogs.");
        }
        
        }
        /*1) the if statement is a block of code that test a condtion and executes a stament id the 
         *   condition is either true or false
         *2) the curly braces opens the body of the if for the executable code to be written
         * 
         *3)values were changed in the codes
         */ 
                
        
    }
}
