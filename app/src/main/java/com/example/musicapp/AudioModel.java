package com.example.musicapp;

import java.io.Serializable;

public class AudioModel implements Serializable {
    String path;
    String title;
    String duration;

    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
    }

    public String getPath() {
        return path;
    }



    public String getTitle() {
        return title;
    }



    public String getDuration() {
        return duration;
    }


}
