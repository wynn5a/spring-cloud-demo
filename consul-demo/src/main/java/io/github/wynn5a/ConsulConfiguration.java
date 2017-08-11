package io.github.wynn5a;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.cloud.consul.ConsulProperties;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

//@Configuration
//@RefreshScope
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class ConsulConfiguration {

//  @Bean
  public ConsulProperties consulProperties() {
    ConsulProperties props = new ConsulProperties();
    props.setEnabled(true);
    props.setHost("172.16.78.108");
    props.setPort(8500);
    return props;
  }


//  @Bean
  public ConsulDiscoveryProperties consulDiscoveryProperties() {
    ConsulDiscoveryProperties props = new ConsulDiscoveryProperties(new InetUtils(new InetUtilsProperties()));
    props.setEnabled(true);
    props.setPreferIpAddress(true);
    props.setHealthCheckCriticalTimeout("1m");
    return props;
  }
}
