/*
 * this work is a licensed property of 10524836.
 *  all rights reserved copyright ©skryptchez kodez
 *  28/02/2016.
 */
package assignment1_10524836;

import java.util.Scanner;

/**
 *
 * @author Fred Adu Twum
 */
public class DumbCalculator {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        double num1,num2,num3,calc;
        System.out.println("What is your first number: ");
        num1 = keyboard.nextDouble();
        System.out.println("What is your second number: ");
        num2 = keyboard.nextDouble();
        System.out.println("Whatis your third number: ");
        num3 = keyboard.nextDouble();
        
        calc = (num1+num2+num3)/2;
        
        System.out.println("( " +num1 + num2 + num3 +" ) / 2 is... " + calc);
        
        
        
    }    
}
