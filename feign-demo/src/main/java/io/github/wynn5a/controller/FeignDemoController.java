package io.github.wynn5a.controller;

import io.github.wynn5a.dto.City;
import io.github.wynn5a.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fuwenming on 2017/4/19.
 */
@RestController
public class FeignDemoController {

    @Autowired
    CityService cityService;

    @GetMapping("feign/cities/{id}")
    public City findByIdFeign(@PathVariable Long id) {
        return cityService.findById(id);
    }
}
