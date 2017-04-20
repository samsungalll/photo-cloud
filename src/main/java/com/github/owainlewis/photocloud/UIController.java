package com.github.owainlewis.photocloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UIController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index () {
        return "Welcome";
    }
}
