package com.mehecske.mehecske;

import java.util.ArrayList;

public class ObstacleManager {
    private ArrayList<Tik> tiks;
    private int playerGap;


    public ObstacleManager(int playerGap){
        this.playerGap = playerGap;

        tiks = new ArrayList<>();

        populateTiks();
    }

    private void populateTiks(){}
}
