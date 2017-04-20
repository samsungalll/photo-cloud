package com.github.owainlewis.photocloud.domain;

public class Photo {

    private final String path;

    public Photo(String path) {
        this.path = path;
    }

    public String getPath () {
        return path;
    }
}
