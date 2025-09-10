package com.example.pkg.controller.trial01;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.NotBlank;

@Validated
public interface Trial01API {

    @GetMapping("/trial01")
    String trial01(@RequestParam @NotBlank String name);
}
