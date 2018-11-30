package com.mehecske.mehecske;

import android.graphics.Bitmap;

public class Virag extends GameObject {

    boolean canSee;

    public Virag(Bitmap img, int speed, int startingX, int startingY) {
        super(img, speed, startingX, startingY);
        setResizedBitmap(getBitmap(), 0.2);
        canSee = true;
    }

    public void setCanSee(boolean canSee) {
        this.canSee = canSee;
    }

    public boolean getCanSee() {
        return canSee;
    }
}
