package edu.up.cs301.campusmap;

import android.graphics.Canvas;

/**
 * Created by Kevin Mellmer on 9/3/2017.
 */

public class NewShape extends SimpleMapToken {
//this class inherits from the simpleMapToken class

    public NewShape(float xCoord, float yCoord) {
        super(xCoord, yCoord);//calls x and y coord from parent class
    }


    public void drawOn(Canvas canvas) {
        //paints a new Shape on the canvas that has one rectangle, and four circles, in the shape of a cross
        canvas.drawRect(x, y, x+15, y+20, paint);
        canvas.drawCircle(x+7, y-3, radius/2, paint); //top circle
        canvas.drawCircle(x+7, y+20, radius/2, paint);//bottom circle
        canvas.drawCircle(x-2, y+10, radius/2, paint);//side circle left
        canvas.drawCircle(x+17, y+10, radius/2, paint);//side circle right
    }
}