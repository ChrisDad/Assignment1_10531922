/*
 * this work is a licensed property of 10524836.
 *  all rights reserved copyright ©skryptchez kodez
 *  28/02/2016.
 */
package assignment1_10524836;

import javax.swing.*;
/**
 *
 * @author CHRISTIAN
 */
public class UsingSwingForInput {
public static void main ( String[] args)
{
    String name = JOptionPane.showInputDialog ( "What is your name?"); 
    String input = JOptionPane.showInputDialog ("How old are You?");  
    int age = Integer.parseInt (input);
    
    System.out.print ( "Hello. " + name + ".");
    System.out.println ("Next year you will be " + (age +1) );
    System.exit (0);
}
}
