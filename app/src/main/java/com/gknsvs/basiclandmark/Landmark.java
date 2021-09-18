package com.gknsvs.basiclandmark;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String info;
    int image;

    public Landmark(String name, String info, int image) {
        this.name = name;
        this.info = info;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

