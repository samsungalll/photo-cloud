package com.github.owainlewis.photocloud.api;

import com.github.owainlewis.photocloud.oracle.OraclePhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotosController {

    private final int DEFAULT_PER_PAGE = 100;

    @Autowired
    OraclePhotoRepository photoRepository;

    @RequestMapping(method = RequestMethod.GET, path ="/api/photos")
    public String index () {
        photoRepository.getBuckets();
        return "Buckets info";
    }
}
