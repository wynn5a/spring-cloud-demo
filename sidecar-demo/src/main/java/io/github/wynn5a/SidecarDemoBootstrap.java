package io.github.wynn5a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarDemoBootstrap {

  public static void main(String[] args) {
    SpringApplication.run(SidecarDemoBootstrap.class, args);
  }
}
