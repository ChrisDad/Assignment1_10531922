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
public class HowOldAreYou {
    public static void main(String[]args){
           Scanner keyboard = new Scanner(System.in);
           String name;
           int age;
           System.out.println("Hey, What's your name? ");
           name = keyboard.next();
           System.out.println("OK, "+name+ ", how old are you? ");
           age = keyboard.nextByte();
           if (age < 16)
           {
               System.out.println("You can't drive, "+name);
           }
           if (age < 18)
           {
               System.out.println("You can't vote, "+name);
           }
           if (age < 25)
           {
               System.out.println("You can't rent a car,"+name);
           }
          if (age > 25)
          {
              System.out.println("You can do anyhting that is legal.");
          }
    }
    
    
}
