package com.example.myapplication.model;

public class Image {
    private int id;
    private String urlimage;

    public Image(int id, String urlimage) {
        this.id = id;
        this.urlimage = urlimage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }
}
