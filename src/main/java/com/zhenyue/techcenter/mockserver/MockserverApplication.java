package com.zhenyue.techcenter.mockserver;

import com.zhenyue.techcenter.mockserver.config.TomcatConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(TomcatConfig.class)
public class MockserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockserverApplication.class, args);
    }

}
