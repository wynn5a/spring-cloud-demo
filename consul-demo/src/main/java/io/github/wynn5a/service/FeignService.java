package io.github.wynn5a.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="test-service-dc")
public interface FeignService {

  @RequestMapping("/")
  String test();
}
