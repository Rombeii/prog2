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

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    private MainThread thread;
    private Meh meh;
    //private Point playerPoint;



    public GameView(Context context){
        super(context);

        getHolder().addCallback(this);                                                              //események megszakításához kell

        meh = new Meh(BitmapFactory.decodeResource(getResources(),R.drawable.meh));
        //meh = new Meh(new Rect(100, 100, 200, 200), Color.rgb(255, 0, 0 ));
        //playerPoint= new Point(150, 150);

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
                thread.join();                                                                      //Lezárja a threadet
            } catch (InterruptedException e){e.printStackTrace();}
            retry = false;
        }
    }

    public void update(){
        meh.update();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                meh.setX((int)event.getX());
                meh.setY((int)event.getY());
                //playerPoint.set((int)event.getX(), (int)event.getY());
        }


        return true;
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        //Bitmap bitmap = Bitmap.createBitmap(1000, 1000, Bitmap.Config.ARGB_8888);


        canvas.drawColor(Color.BLUE);
        //canvas.drawBitmap(bitmap,0, 0,paint);
        meh.draw(canvas);
        if(canvas != null){
            //characterSprite.draw(canvas);
        }
    }


}
