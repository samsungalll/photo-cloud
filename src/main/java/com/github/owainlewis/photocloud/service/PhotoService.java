package com.github.owainlewis.photocloud.service;

import com.github.owainlewis.photocloud.domain.Photo;

import java.util.List;

public interface PhotoService {

    List<Photo> getAll();

    Void create(Photo photo);
}
