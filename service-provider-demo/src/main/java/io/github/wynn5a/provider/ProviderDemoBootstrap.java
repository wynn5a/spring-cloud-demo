package io.github.wynn5a.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by fuwenming on 2017/4/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderDemoBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoBootstrap.class, args);
    }
}
