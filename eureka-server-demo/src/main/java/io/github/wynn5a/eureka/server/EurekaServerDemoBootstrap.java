package io.github.wynn5a.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by fuwenming on 2017/4/8.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerDemoBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerDemoBootstrap.class, args);
    }
}
