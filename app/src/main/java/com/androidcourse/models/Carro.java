package com.androidcourse.models;

/**
 * Created by darkgeat on 04/03/2017.
 */

public class Carro {
    private int id_image;
    private String title;
    private String description;

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Carro(int id_image, String title, String description) {

        this.id_image = id_image;
        this.title = title;
        this.description = description;
    }
}
