/*
 * this work is a licensed property of 10524836.
 *  all rights reserved copyright ©skryptchez kodez
 *  28/02/2016.
 */
package assignment1_10524836;

import java.util.Scanner;
/**
 *
 * @author CHRISTIAN
 */
public class LittleQuiz {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String ready;
        int ans1,ans2,ans3;
        
        int count = 0;
        
        System.out.println("Are you ready for a quiz? ");
        ready = keyboard.next();
        System.out.println("Okay, here it comes! ");
       
        System.out.println("Q1) What is the capital of Alaska? ");
        System.out.println("1) Melbourne \n2) Anchorage \n3) Juneau ");
        ans1 = keyboard.nextInt();
        if (ans1 == 3)
        {
           System.out.println("That's right");
           count += 1;
        }
        else
        {
            System.out.println("Sorry, the answer is Juneau.");
            count += 0;
        }
        
        System.out.println("Q2) Can you store the values 'cat' in the variable of type int");
        System.out.println("1) yes \n2) no ");
        ans2 = keyboard.nextInt();
        if (ans2 == 2)
        {
           System.out.println("BRilliant, You got it!");
           count += 1;
        }
        else
        {
            System.out.println("Sorry, 'cat' is a string. ints can only store numbers.");
            count += 0;
        }
        
        System.out.println("Q3) What is the result of 9+6/3? ");
        System.out.println("1) 5 \n2) 11 \n3) 15/3 ");
        ans3 = keyboard.nextInt();
        if (ans1 == 3)
        {
           System.out.println("That's correct");
           count += 1;
        }
        else
        {
            System.out.println("Sorry, the answer is 15/3.");
            count += 0;
        }
        
        System.out.println("Overall, you got "+count+" out of 3 correct.");
        System.out.println("Thanks for playing!");
                
    }
}
