package com.zingmp3.playlist;

public class Playlist {
    private int img;
    private String name;
    private String detail;

    public Playlist(int img, String name, String detail) {
        this.img = img;
        this.name = name;
        this.detail = detail;
    }

    public Playlist(int img, String name) {
        this.img = img;
        this.name = name;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
