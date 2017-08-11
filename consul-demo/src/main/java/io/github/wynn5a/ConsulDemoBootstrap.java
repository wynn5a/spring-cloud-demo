package io.github.wynn5a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableDiscoveryClient
@RestController
@SpringBootApplication
@EnableFeignClients
public class ConsulDemoBootstrap{
  @RequestMapping("/")
  public String home() {
    return "Hello World-consumer";
  }

  public static void main(String[] args) {
    SpringApplication.run(ConsulDemoBootstrap.class, args);
  }
}