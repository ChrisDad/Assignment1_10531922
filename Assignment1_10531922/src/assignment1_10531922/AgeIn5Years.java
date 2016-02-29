/*
 * this work is a licensed property of 10524836.
 *  all rights reserved copyright ©skryptchez kodez
 *  28/02/2016.
 */
package assignment1_10524836;
import java.util.Scanner;

/**
 *
 * @ Fred Adu Twum
 */
public class AgeIn5Years {
    public static void main(String[]args){
            Scanner keyboard = new Scanner(System.in);
            String name;
            int age;
            System.out.println("Hello, What is your name? ");
            name = keyboard.next();
            
            System.out.println("HI, "+name+"! How old are you? ");
            age = keyboard.nextInt();
            int age1 = age + 5;
            int age2 = age - 5;
            
            System.out.println("Did you know that in Five years you will be "+ age1 +" years old? ");
            System.out.println("And Five years ago you were "+ age2 + "! Imagine that");
            
            
    }
}
