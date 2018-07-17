package com.mrjeus.mygirl;

public class Hero {
    private int mImage;
    private String mName;

    public Hero(int image, String name) {
        this.mImage =  mImage;
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int image) {
        this.mImage = mImage;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
