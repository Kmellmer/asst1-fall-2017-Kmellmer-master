package edu.up.cs301.campusmap;

/**
 * <!-- class TokenFactory -->
 *
 * This class is used to create map tokens.
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Kevin Mellmer
 * @version August 2017
 */

public class TokenFactory {
    /**
     * createMapToken
     *
     * creates a new object whose type is SimpleMapToken or some subclass
     * thereof and returns it to the caller
     *
     * @param x x-coordinate of the token
     * @param y y-coordinate of the token
     * @param type which type of token to draw (0, 1 or 2)
     */


    public static SimpleMapToken createMapToken(float x, float y, int type)
    {

        switch(type)
        {
            case 0:
                return new SimpleMapToken(x,y);//selects the circle token
            case 1:
                return new SquareToken(x,y);//selects the square token
            case 2:
                return new NewShape(x,y);//selects the new shape token
            default:
                return new SimpleMapToken(x,y);//defaults to the circle token
        }
    }//createMapToken

}//class TokenFactory
