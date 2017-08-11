package io.github.wynn5a.service;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.coordinate.model.Datacenter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class ServiceDemo {

  @Autowired
  private DiscoveryClient discoveryClient;
  @Autowired
  private ConsulClient consulClient;

  List<String> call() {
    return discoveryClient.getServices();
  }

  List<ServiceInstance> instances() {
    return discoveryClient.getInstances("test-service-dc");
  }

  List<Datacenter> datacenters() {
    return consulClient.getDatacenters().getValue();
  }
}
