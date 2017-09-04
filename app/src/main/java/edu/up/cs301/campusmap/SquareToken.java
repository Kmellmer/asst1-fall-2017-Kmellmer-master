package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * Created by Kevin Mellmer on 9/3/2017.
 */

public class SquareToken extends SimpleMapToken {
//this class inherits from the simpleMapToken class

        public SquareToken(float xCoord, float yCoord) {
                super(xCoord, yCoord);//calls x and y coord from parent class
        }


        public void drawOn(Canvas canvas) {
            //paints the square on canvas
            canvas.drawRect(x,y,x+30,y+30,paint);
        }
}
