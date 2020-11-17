package com.zingmp3.thuvien;

public class ThuVien {
    private int img;
    private String name;
    private int color;


    public ThuVien(int img, String name, int color) {
        this.img = img;
        this.name = name;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
