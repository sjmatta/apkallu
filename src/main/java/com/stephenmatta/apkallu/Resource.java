package com.stephenmatta.apkallu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    private static final Logger log = LoggerFactory.getLogger(Resource.class);

    @GetMapping("test")
    public String test() {
        log.error("test");
        return "test";
    }
}
