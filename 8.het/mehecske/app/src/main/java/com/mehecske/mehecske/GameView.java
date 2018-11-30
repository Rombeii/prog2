package com.mehecske.mehecske;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

import java.util.Random;

import static android.graphics.Color.rgb;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    private MainThread thread;
    private Meh meh;
    private Tik[] tikek;
    private Virag[] viragok;

    //private Point playerPoint;



    public GameView(Context context){
        super(context);

        getHolder().addCallback(this);                                                              //események megszakításához kell

        meh = new Meh(BitmapFactory.decodeResource(getResources(),R.drawable.meh), 2, this.getResources().getDisplayMetrics().widthPixels/2, this.getResources().getDisplayMetrics().heightPixels/2);
        //a mehecske a kepernyo kozepen jelenjen meg
        tikek = new Tik[4];
        tikek[0] = new Tik(BitmapFactory.decodeResource(getResources(),R.drawable.tik), 4, this.getResources().getDisplayMetrics().widthPixels-120, this.getResources().getDisplayMetrics().heightPixels-120);
        tikek[1] = new Tik(BitmapFactory.decodeResource(getResources(),R.drawable.tik), 4, this.getResources().getDisplayMetrics().widthPixels-120,120);
        tikek[2] = new Tik(BitmapFactory.decodeResource(getResources(),R.drawable.tik), 4, 120, this.getResources().getDisplayMetrics().heightPixels-120);
        tikek[3] = new Tik(BitmapFactory.decodeResource(getResources(),R.drawable.tik), 4, 120,120);

        viragok = new Virag[15];

        Random random = new Random();
        int szam = 0;
        int posX = 0;
        int posY = 0;
        for(int i = 0; i < 15; i++){
            szam = random.nextInt(1000);
            posX = random.nextInt(getResources().getDisplayMetrics().widthPixels);
            posY = random.nextInt(getResources().getDisplayMetrics().heightPixels);
            if(szam % 3 == 0){
                viragok[i] = new Virag(BitmapFactory.decodeResource(getResources(),R.drawable.virag1), 4, posX, posY);
            }else if(szam % 3 == 1){
                viragok[i] = new Virag(BitmapFactory.decodeResource(getResources(),R.drawable.virag2), 4, posX, posY);
            }else{
                viragok[i] = new Virag(BitmapFactory.decodeResource(getResources(),R.drawable.virag3), 4, posX, posY);
            }

        }

        setFocusable(true);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        thread = new MainThread(getHolder(), this);



        thread.setRunning(true);
        thread.start();

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        while(retry){
            try{
                thread.setRunning(false);
                thread.join();
            } catch (InterruptedException e){e.printStackTrace();}
            retry = false;
        }
    }

    public void update(){
        for(int i = 0; i < 4; i++){
            if (CollisionDetector.isCollisionDetected(meh.getResizedBitmap(), meh.getCurrentX() - meh.getResizedBitmap().getWidth()/2, meh.getCurrentY() - meh.getResizedBitmap().getHeight()/2,
                    tikek[i].getResizedBitmap(), tikek[i].getCurrentX() - tikek[0].getResizedBitmap().getWidth()/2, tikek[i].getCurrentY() - tikek[0].getResizedBitmap().getHeight()/2)){
                System.out.println("utkozik");
                thread.setRunning(false);
            }
        }

        for(int i = 0; i < 15; i++){
            if (CollisionDetector.isCollisionDetected(meh.getResizedBitmap(), meh.getCurrentX() - meh.getResizedBitmap().getWidth()/2, meh.getCurrentY() - meh.getResizedBitmap().getHeight()/2,
                    viragok[i].getResizedBitmap(), viragok[i].getCurrentX() - viragok[0].getResizedBitmap().getWidth()/2, viragok[i].getCurrentY() - viragok[0].getResizedBitmap().getHeight()/2)){
                viragok[i].setCanSee(false);
            }
        }


        meh.update();
        tikek[0].update();
        tikek[1].update();
        tikek[2].update();
        tikek[3].update();

        boolean won = false;
        for(int i = 0; i < 15; i++){                                                                //amíg van olyan virág, amit látunk, addig nem nyerünk
            if(viragok[i].getCanSee() == true)
                won = false;
        }

        if(won)
            thread.setRunning(false);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:                                                           //lenyomással jelezhetjük, hogy merrre menjen a méhecskénk
                meh.setTowardsX((int)event.getX());
                meh.setTowardsY((int)event.getY());
                //playerPoint.set((int)event.getX(), (int)event.getY());
        }


        return true;
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        canvas.drawColor(Color.WHITE);


        for(int i = 0; i < 15; i++){
            if(viragok[i].getCanSee() == true)
                viragok[i].draw(canvas);
        }

        meh.draw(canvas);
        tikek[0].draw(canvas);
        tikek[1].draw(canvas);
        tikek[2].draw(canvas);
        tikek[3].draw(canvas);


        if(canvas != null){

        }
    }


}
