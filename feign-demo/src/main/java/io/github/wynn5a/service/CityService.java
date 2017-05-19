package io.github.wynn5a.service;

import io.github.wynn5a.dto.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fuwenming on 2017/4/19.
 */
@FeignClient(name = "service-provider-demo")
public interface CityService {
    @RequestMapping("cities/{id}")
    City findById(@RequestParam("id") Long id);
}
