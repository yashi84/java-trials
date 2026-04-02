package com.example.pkg.controller.trial03;

import com.example.pkg.config.trial03.Trial03Config;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Trial03ConfigTest {

    @Autowired
    private Trial03Config trial03Config;

    @Test
    void testConfigLoading() {
        assertThat(trial03Config.getAaa()).isEqualTo("aaa");
        assertThat(trial03Config.getBbb()).isEqualTo("bbb");
    }
}
