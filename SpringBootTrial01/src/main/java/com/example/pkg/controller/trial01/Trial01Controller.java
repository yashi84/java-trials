package com.example.pkg.controller.trial01;

import org.springframework.web.bind.annotation.RestController;

@RestController
//@Validated
public class Trial01Controller implements Trial01API {

    @Override
    public String trial01(String name) {
        return "trial01: " + name;
    }
}

