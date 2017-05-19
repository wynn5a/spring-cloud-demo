package io.github.wynn5a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by fuwenming on 2017/4/11.
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignDemoBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(FeignDemoBootstrap.class, args);
    }
}
