package com.mehecske.mehecske;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class Meh implements GameObject {

    private Bitmap bitmap;
    private int x, y;                                                                               //a méhecske koordinátái

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Meh(Bitmap img) {
        this.bitmap = img;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap,x-bitmap.getWidth()/2,y-bitmap.getHeight()/2, null);
    }

    @Override
    public void update() {

    }

}

   /* public void update(Point point){
        bitmap.
        //rectangle.set(point.x - rectangle.width()/2,point.y - rectangle.height()/2, point.x + rectangle.width()/2,point.y + rectangle.height()/2);
    }*/

