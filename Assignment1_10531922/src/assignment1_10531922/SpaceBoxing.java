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
public class SpaceBoxing {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        double weight;
        
        System.out.println("Please enter your current earth weight ");
        weight =keyboard.nextDouble();
        
        System.out.println("I have information on the following palnets: ");
        System.out.println("1. Venus   2. Mars   3. Jupiter ");
        System.out.println("4. Saturn  5. uranus 6. Neptune ");
            
        System.out.println("Which planet are you visiting? ");
        int choice = keyboard.nextInt();
        if(choice == 1)
        {
            weight = weight*0.78;
            System.out.println("Your weight will be "+weight+" ponuds on that planet.");
        }
        if(choice == 2)
        {
            weight = weight*0.39;
            System.out.println("Your weight will be "+weight+" ponuds on that planet.");
        }
        if(choice == 3)
        {
            weight = weight*2.65;
            System.out.println("Your weight will be "+weight+" ponuds on that planet.");
        }
        if(choice == 4)
        {
            weight = weight*1.17;
            System.out.println("Your weight will be "+weight+" ponuds on that planet.");
        }
        if(choice == 5)
        {
            weight = weight*1.05;
            System.out.println("Your weight will be "+weight+" ponuds on that planet.");
        }
        if(choice == 6)
        {
            weight = weight*1.23;
            System.out.println("Your weight will be "+weight+" ponuds on that planet.");
        }
    }
}
