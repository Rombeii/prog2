package com.mehecske.mehecske;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Tik implements GameObject{

    private Rect rectangle;
    private int color;

    public Tik(Rect rectangle, int color){
        this.color = color;
        this.rectangle = rectangle;
    }

    public Rect getRectangle() {
        return rectangle;
    }

    /*public boolean mehCollide(Meh meh){
        if(rectangle.contains(meh.getRectangle().left, meh.getRectangle().top)
                || rectangle.contains(meh.getRectangle().right, meh.getRectangle().top)
                || rectangle.contains(meh.getRectangle().right, meh.getRectangle().bottom)
                || rectangle.contains(meh.getRectangle().left, meh.getRectangle().bottom)){

            return true;
        }
        return false;
    }*/

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangle, paint);
    }

    @Override
    public void update() {

    }
}
