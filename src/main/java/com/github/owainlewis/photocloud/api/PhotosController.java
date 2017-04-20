package com.github.owainlewis.photocloud.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotosController {

    private final int DEFAULT_PER_PAGE = 100;

    @RequestMapping(method = RequestMethod.GET, path ="/api/photos")
    public String index () {
        return "OK";
    }
}
