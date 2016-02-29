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
public class ModuloAnimation {
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%10 == 0 )
				System.out.print(" fred is cool. \r");

			Thread.sleep(200);
		}
		
	}
}
    

