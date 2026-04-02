package com.example.pkg.controller.trial02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyData {
    public MyData(int counter) {
        this(counter, LocalDateTime.now().toString());
    }
    public int counter;
    public String date;
}
