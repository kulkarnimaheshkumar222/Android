package com.example.recyclerviewpractice2;

public class ExampleModel {
    private int mImageResource;
    private String mText;

    public  ExampleModel(int imageResource,String text) {
        mImageResource = imageResource;
        mText = text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }
}
