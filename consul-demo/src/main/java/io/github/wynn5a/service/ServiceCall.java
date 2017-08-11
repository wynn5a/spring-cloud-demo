package io.github.wynn5a.service;

import com.ecwid.consul.v1.QueryParams.Builder;
import com.ecwid.consul.v1.coordinate.model.Datacenter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCall {

  @Autowired
  private ServiceDemo serviceDemo;
  @Autowired
  private FeignService feignService;

  @Autowired
  private ConsulDiscoveryClient discoveryClient;

  @RequestMapping("/call")
  public String feign() {
    return feignService.test();
  }


  @RequestMapping("/test")
  public String call() {
    return serviceDemo.call().toString();
  }

  @RequestMapping("/instances")
  public List<ServiceInstance> instances() {
    return serviceDemo.instances();
  }

  @RequestMapping("/datacenters")
  public List<Datacenter> datacenters() {
    return serviceDemo.datacenters();
  }

  @RequestMapping("/services")
  public List<ServiceInstance> services() {
    return discoveryClient.getInstances("test-service-dc", Builder.builder().setDatacenter("dc24").build());
  }
}
