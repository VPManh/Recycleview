package com.example.a_recyceleview;

public class Book {
    private int resoureImg;
    private String name,mota;

    public Book(int resoureImg, String name, String mota) {
        this.resoureImg = resoureImg;
        this.name = name;
        this.mota = mota;
    }

    public int getResoureImg() {
        return resoureImg;
    }

    public void setResoureImg(int resoureImg) {
        this.resoureImg = resoureImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
