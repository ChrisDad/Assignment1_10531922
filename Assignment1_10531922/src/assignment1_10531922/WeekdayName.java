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
public class WeekdayName {
    public static void main(String[]args){
        Scanner keyboard  = new Scanner(System.in);
        int day;
        day = keyboard.nextInt();
        if (day == 1)
        {
            System.out.println("Weekday 1: Sunday");
        }
        else if (day == 2)
        {
            System.out.println("Weekday 2: Monday");
        }
        else if (day == 3)
        {
            System.out.println("Weekday 2: Tuesday");
        }
        else if (day == 4)
        {
            System.out.println("Weekday 2: Wednesday");
        }
        else if (day == 5)
        {
            System.out.println("Weekday 2: Thursday");
        }
        else if (day == 6)
        {
            System.out.println("Weekday 2: Friday");
        }
        else if (day == 0)
        {
            System.out.println("Weekday 2: Saturday");
        }
        else
        {
            System.out.println("error");
        }
       
       
        
    }
    
}
