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
public class MoreUserInputOfData {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        String fname,lname,grade,idnum,log;
        double GPA;
        
        System.out.println("Please enter the following information so that i can sell it for profit! ");
        
        System.out.print("First name: ");
        fname = keyboard.next();
        
        System.out.print("\nLast name: ");
        lname = keyboard.next();
        
        System.out.print("\nGrade (9 - 12): ");
        grade = keyboard.next();
        
        System.out.print("\nStudent ID: ");
        idnum = keyboard.next();
        
        System.out.print("\nLogin: ");
        log = keyboard.next();
        
        System.out.print("\nGPA (0.0 - 4.0: ");
        GPA = keyboard.nextDouble();
        
        System.out.print("\nYour Information:");
        System.out.print("\nLogin: " + log);
        System.out.print("\nID: " + idnum);
        System.out.print("\nName: " + lname +", " + fname);
        System.out.print("\nGPA: " + GPA);
        System.out.print("\nGrade " + grade);
        
    }
    
}
