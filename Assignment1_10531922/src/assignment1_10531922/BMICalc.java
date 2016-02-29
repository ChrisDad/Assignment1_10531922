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
public class BMICalc {
        public static void main(String[]args){
            Scanner keyboard = new Scanner(System.in);
            double height,weight,BMI;
            System.out.println("Your height in m: ");
            height = keyboard.nextDouble();
            System.out.println("Your weight in kg: ");
            weight = keyboard.nextDouble();
            
            BMI = weight/(height*height) ;
            System.out.println("Your BMI is "+ BMI);
            
            
            
            
                    
        }
}
