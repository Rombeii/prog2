package com.mehecske.mehecske;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Random;



public class Tik extends GameObject{
    private Random random = new Random();


    int counter = 0;
    boolean moving;

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;



    public Tik(Bitmap img, int speed, int startingX, int startingY) {
        super(img, speed, startingX, startingY);
        setResizedBitmap(getBitmap(), 0.35);

        setTowardsX(random.nextInt(screenWidth));
        setTowardsY(random.nextInt(screenHeight));


    }

    @Override
    public void update() {
            if(getCurrentX() <= getTowardsX())
                setCurrentX(getCurrentX()+getSpeed());
            if(getCurrentY() <= getTowardsY())
                setCurrentY(getCurrentY()+getSpeed());
            if(getCurrentX() >= getTowardsX())
                setCurrentX(getCurrentX()-getSpeed());
            if(getCurrentY() >= getTowardsY())
                setCurrentY(getCurrentY()-getSpeed());
        if(Math.abs(getTowardsX() - getCurrentX()) < 5 && Math.abs(getTowardsY() - getCurrentY()) < 5){
            System.out.println("megerkezett");
            setTowardsX(random.nextInt(screenWidth));
            setTowardsY(random.nextInt(screenHeight));
            counter++;
        }





    }

}
