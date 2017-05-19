package io.github.wynn5a.provider.controller;

import io.github.wynn5a.provider.entity.CityEntity;
import io.github.wynn5a.provider.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fuwenming on 2017/4/8.
 */
@RestController
@RequestMapping("cities")
public class ServiceProviderDemoController {

    @Autowired
    private CityRepository cityRepository;


    @GetMapping("/{id}")
    public CityEntity findById(@PathVariable Long id) {
        return cityRepository.findOne(id);
    }
}
