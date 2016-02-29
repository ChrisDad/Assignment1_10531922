/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10524836;

/**
 *
 * @author Fred Adu Twum
 */
import java.util.Scanner;

public class ForgetfulMachine {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
     
       
        System.out.println("Give me a word! ");
        keyboard.next();
        
        System.out.println("Give me a second word! ");
        keyboard.next();
        
        System.out.println("\nGreat, now your favorite number? ");
        keyboard.next();
                
        
        System.out.println("And your second favorite number... ");
        keyboard.next();
        
        System.out.println("\nWhew! Wasn't that fun?" );
        
       
    }
    
    
}
