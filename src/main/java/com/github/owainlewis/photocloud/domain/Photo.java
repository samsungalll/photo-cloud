package com.github.owainlewis.photocloud.domain;

public class Photo {

    private final String fileName;

    public Photo(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName () {
        return fileName;
    }

}
