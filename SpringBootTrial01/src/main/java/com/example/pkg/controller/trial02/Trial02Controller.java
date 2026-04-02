package com.example.pkg.controller.trial02;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class Trial02Controller {

    @GetMapping("/trial02")
    public List<MyData> index(@RequestParam(required = true, defaultValue = "3") int size) {
        List<MyData> list = new ArrayList<>();
        for ( int i = 0; i < size; i++) {
            list.add(new MyData(i+1));
        }
        return list;
    }

    @GetMapping("/trial02u")
    public MyData indexu(@RequestParam(required = true, defaultValue = "3") int size) {
        return new MyData(9);
    }

    @GetMapping("/trial02n")
    public MyData indexn(@RequestParam(required = true, defaultValue = "3") int size) {
        return null;
    }

}

