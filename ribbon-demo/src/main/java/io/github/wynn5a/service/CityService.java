package io.github.wynn5a.service;

import io.github.wynn5a.dto.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fuwenming on 2017/4/8.
 */
@Service
public class CityService {
    private static final String SERVICE_URL = "http://service-provider-demo/cities/";

    @Autowired
    private RestTemplate restTemplate;

    public City findById(Long id) {
        Assert.notNull(id, "id should not be null!");
        return this.restTemplate.getForObject(SERVICE_URL + id, City.class);
    }
}
