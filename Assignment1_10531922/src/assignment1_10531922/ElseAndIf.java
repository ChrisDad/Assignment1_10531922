/*
 * this work is a licensed property of 10524836.
 *  all rights reserved copyright ©skryptchez kodez
 *  28/02/2016.
 */
package assignment1_10524836;

/**
 *
 * @author CHRISTIAN
 */
public class ElseAndIf {
    public static void main(String[]args){
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        if (cars < people )
        {
            System.out.println("We should take the cars.");
        }
        else if (cars < people)
        {
            System.out.println("We should not take the cars.");
        }
        // else
        //{
        //    System.out.println("We can't decide.");
        //}    
        if(buses > cars)
        {
            System.out.println("Thats too many buses ");
        }
        else if (buses < cars)
        {
            System.out.println("Maybe we could take the buses.");
        }
        else 
        {
            System.out.println("We still can't decide.");
        }
        if (people > buses)
        {
            System.out.println("All right, let's just take the buses.");
        }
        else
        {
            System.out.println("Fine, let's stay home then.");
        }
               
    }
    
}
/*
 *else if and else provide alternate conditions. 
 *removing the else makes no difference
 */