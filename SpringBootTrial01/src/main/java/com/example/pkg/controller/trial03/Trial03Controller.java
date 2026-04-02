package com.example.pkg.controller.trial03;

import com.example.pkg.config.trial03.Trial03Config;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/trial03")
public class Trial03Controller {

    private final Trial03Config trial03Config;

    public Trial03Controller(Trial03Config trial03Config) {
        this.trial03Config = trial03Config;
    }

    @GetMapping("/config")
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("aaa", trial03Config.getAaa());
        config.put("bbb", trial03Config.getBbb());
        return config;
    }
}
