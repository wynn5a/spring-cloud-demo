package io.github.wynn5a.service;

import io.github.wynn5a.dto.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * add hystrix for fault tolerance
 * <p>
 * Created by fuwenming on 2017/4/19.
 */
@FeignClient(name = "service-provider-demo", fallback = CityService.HystrixDemo.class)
public interface CityService {
    @RequestMapping("cities/{id}")
    City findById(@RequestParam("id") Long id);

    @Component
    class HystrixDemo implements CityService {
        private City failCity = null;

        @Override
        public City findById(Long id) {
            return getFailCity();
        }

        private City getFailCity() {
            if (failCity == null) {
                failCity = new City();
                failCity.setCountry("UNKNOWN COUNTRY");
                failCity.setId(-1l);
                failCity.setName("UNKNOWN NAME");
                failCity.setState("UNKNOWN STATE");
            }

            return failCity;
        }
    }
}
